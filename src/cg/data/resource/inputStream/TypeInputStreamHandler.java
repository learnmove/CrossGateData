package cg.data.resource.inputStream;

import static cg.base.util.IOUtils.PATH_SPLIT;

import java.net.URI;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;

import cg.base.util.IOUtils;
import cg.base.util.URLHandler;
import cg.data.resource.AWSS3;

public abstract class TypeInputStreamHandler<T> implements InputStreamHandler<T> {
	
	protected static final Logger log = LoggerFactory.getLogger(TypeInputStreamHandler.class);
	
	protected Map<String, URI> uris = Maps.newHashMap();
	
	protected Map<String, String> lowerCaseNames = Maps.newHashMap();
	
	protected final String type;
	
	public TypeInputStreamHandler(String type) {
		this.type = type;
	}
	
	protected abstract T get(URI uri) throws Exception;
	
	protected void add(String name, URI uri) {
		uris.put(name, uri);
		lowerCaseNames.put(name.toLowerCase(), name);
	}

	@Override
	public void addURI(URI uri) {
		try {
			String name = IOUtils.decode(uri.toString());
			int lastDotIndex = name.lastIndexOf(".");
			name = name.substring(0, lastDotIndex);
			int index;
			if ((index = name.lastIndexOf(PATH_SPLIT)) > -1) {
				name = name.substring(index + 1);
			}
			if (!name.startsWith("~$")) {
				add(name, uri);
			}
		} catch (Exception e) {
			log.error("", e);
		}
	}

	@Override
	public T get(String name) {
		String key = name.replace(".txt", "");
		try {
			URI uri = uris.containsKey(key) ? uris.get(key) : uris.get(lowerCaseNames.get(key.toLowerCase()));
			return uri == null ? null : get(uri);
		} catch (Exception e) {
			log.error("", e);
			return null;
		}
	}
	
	protected static void getStream(URI uri, URLHandler handler) throws Exception {
		if (AWSS3.isAWS_S3(uri)) {
			AWSS3.requestS3ToStream(uri, handler);
		} else {
			IOUtils.getStream(uri, handler);
		}
	}

}
