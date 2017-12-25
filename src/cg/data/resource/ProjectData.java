package cg.data.resource;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;
import org.jdom2.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tool.server.ioc.IOC;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.io.IExcelProvider;
import cg.base.loader.IOCBeanType;
import cg.base.loader.ISourceData;
import cg.base.util.IOUtils;
import cg.data.gmsvReader.CAnimationReaderEx;
import cg.data.loader.IDataPlatform;
import cg.data.map.AreaFileHandler;
import cg.data.map.AreaLoader;
import cg.data.map.AreaNetHandler;
import cg.data.resource.inputStream.InputStreamHandler;
import cg.data.resource.inputStream.InputStreamHandler.DataInfo;
import cg.data.resource.inputStream.InputStreamHandlers;
import cg.data.resource.loader.ServerResourceLoader;

public class ProjectData implements Reloadable, IExcelProvider, ISourceData {
	
	public static final String FILE_TYPE_TEXT = "txt";
	
	public static final String FILE_TYPE_XML = "xml";
	
	public static final String FILE_TYPE_EXCEL = "xlsx";
	
	protected static final Logger log = LoggerFactory.getLogger(ProjectData.class);
	
	@SuppressWarnings("rawtypes")
	protected Map<Class, InputStreamHandler> inputStreamHandlers;
	
	@SuppressWarnings("rawtypes")
	protected Map<String, ObjectReader> objectReaders;
	
	protected List<ProjectDataListener> listeners;
	
	protected String serverPath;
	
	protected AreaLoader areaLoader;
	
	protected ImageManager imageManager;
	
	protected AnimationReader animationReader;
	
	protected MessageManager messageManager;
	
	public ProjectData(String serverPath) throws Exception {
		this.serverPath = serverPath;
		objectReaders = Maps.newHashMap();
		listeners = Lists.newLinkedList();
		inputStreamHandlers = Maps.newHashMap();
		inputStreamHandlers.put(String[].class, InputStreamHandlers.createTextHandler(FILE_TYPE_TEXT));
		inputStreamHandlers.put(Document.class, InputStreamHandlers.createXmlHandler(FILE_TYPE_XML));
		inputStreamHandlers.put(Workbook.class, InputStreamHandlers.createExcelHandler(FILE_TYPE_EXCEL));
		areaLoader = new URI(serverPath).getHost() == null ? new AreaFileHandler() : new AreaNetHandler(serverPath);
	}
	
	public void loadURI(ServerResourceLoader serverResourceLoader) throws Exception {
		serverResourceLoader.load(serverPath, (uri) -> {
			try {
				String path = IOUtils.OS.contains("win") ? uri.getPath() : URLDecoder.decode(uri.toString(), "utf-8");
				if (path.endsWith(FILE_TYPE_TEXT)) {
					inputStreamHandlers.get(String[].class).addURI(uri);
				} else if (path.endsWith(FILE_TYPE_EXCEL)) {
					inputStreamHandlers.get(Workbook.class).addURI(uri);
				} else if (path.endsWith(FILE_TYPE_XML)) {
					inputStreamHandlers.get(Document.class).addURI(uri);
				} else {
					// This is a map.
				}
			} catch (Exception e) {
				log.error("", e);
			}
			return null;
		});
	}
	
	public void init(IDataPlatform dataPlatform) throws Exception {
		imageManager = createImageManager(dataPlatform);
		animationReader = createAnimationReader(dataPlatform);
		messageManager = createMessageManager();
		loadReaderBeans();
	}
	
	protected ImageManager createImageManager(IDataPlatform dataPlatform) {
		ReadImageResourceManager imageManager = new ReadImageResourceManager(dataPlatform.getClientFilePath());
		addListener(imageManager);
		return imageManager;
	}
	
	protected AnimationReader createAnimationReader(IDataPlatform dataPlatform) {
		CAnimationReaderEx animationReader = new CAnimationReaderEx(dataPlatform.getClientFilePath(), dataPlatform.getTimer());
		addListener(animationReader);
		return animationReader;
	}
	
	protected MessageManager createMessageManager() {
		MessageManager messageManager = new MessageManager();
		addListener(messageManager);
		return messageManager;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void loadReaderBeans() throws Exception {
		IOC ioc = new IOC();
		ioc.load("cg", IOCBeanType.READER, null);
		ioc.getAll().forEach((k, v) -> addObjectReader((ObjectReader) v));
	}
	
	public void clearResource() {
		for (@SuppressWarnings("rawtypes") InputStreamHandler inputStreamHandler : inputStreamHandlers.values()) {
			inputStreamHandler.clear();
		}
	}

	@Override
	public void reload() throws Exception {
		for (@SuppressWarnings("rawtypes") InputStreamHandler inputStreamHandler : inputStreamHandlers.values()) {
			inputStreamHandler.reload();
		}
		
		for (ProjectDataListener listener : listeners) {
			listener.reload(this);
			log.info("{} reload finish.", listener.getClass().getSimpleName());
		}
	}
	
	public final String[] getTextResource(String name) {
		return this.<String[]>getInputStreamHandler(String[].class).get(name);
	}
	
	public final Document getXmlResource(String name) {
		return this.<Document>getInputStreamHandler(Document.class).get(name);
	}
	
	@Override
	public final Workbook getWorkbook(String name) {
		return this.<Workbook>getInputStreamHandler(Workbook.class).get(name);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <T> InputStreamHandler<T> getInputStreamHandler(Class T) {
		return (InputStreamHandler<T>) inputStreamHandlers.get(T);
	}
	
	public final <T> void addObjectReader(ObjectReader<T> reader) {
		Type[] types = reader.getClass().getGenericInterfaces();
		if (types.length > 0 && types[0] instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) types[0];
			Type[] subTypes = parameterizedType.getActualTypeArguments();
			if (subTypes.length > 0 && subTypes[0] instanceof Class) {
				objectReaders.put(subTypes[0].toString(), reader);
			} else {
				log.warn("{}::addObjectReader() subTypes not fit.", getClass().getName());
			}
		} else {
			log.warn("{}::addObjectReader() types not fit.", getClass().getName());
		}
	}
	
	public final <T> List<T> read(Class<T> clz) {
		return getReader(clz).read(this);
	}

	@SuppressWarnings("unchecked")
	public final <X, T extends ObjectReader<X>> T getReader(Class<X> clz) {
		return (T) objectReaders.get(clz.toString());
	}
	
	@SuppressWarnings("unchecked")
	public final List<DataInfo> getFileList() {
		int size = 0;
		List<DataInfo> list = Lists.newArrayListWithCapacity(size);
		for (@SuppressWarnings("rawtypes") InputStreamHandler inputStreamHandler : inputStreamHandlers.values()) {
			Collection<DataInfo> dataInfos = inputStreamHandler.getDataInfos();
			size += dataInfos.size();
			list.addAll(dataInfos);
		}
		return list;
	}
	
	public final void addListener(ProjectDataListener listener) {
		listeners.add(listener);
	}
	
	public final void removeListener(ProjectDataListener listener) {
		listeners.remove(listener);
	}
	
	public final AreaLoader createAreaLoader() {
		return areaLoader;
	}

	@Override
	public final ImageManager getImageManager() {
		return imageManager;
	}

	@Override
	public final AnimationReader getAnimationReader() {
		return animationReader;
	}

	public final MessageManager getMessageManager() {
		return messageManager;
	}

}
