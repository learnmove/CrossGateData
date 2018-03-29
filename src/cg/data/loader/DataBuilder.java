package cg.data.loader;

import java.net.URI;

import cg.base.loader.Builder;
import cg.data.map.MapInfo;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.resource.ReloadManager;
import cg.data.title.TitleManager;

public abstract class DataBuilder extends Builder implements IDataPlatform {
	
	protected ReloadManager reloadManager;
	
	protected ProjectData projectData;

	protected byte model;
	
	protected TitleManager titleManager;
	
	protected URI serverFilePath;

	@Override
	protected final void loadMore() throws Exception {
		serverFilePath = loadServerFilePath();
		fileVersionManager = createFileVersionManager();
		model = createModel();
		reloadManager = createReloadManager();
		projectData = createProjectData();
		registerReload();
		reloadManager.reload();
		titleManager = createTitleManager();
		projectData.addObjectReader(createMapReader());
		loadMore0();
	}
	
	protected abstract void loadMore0() throws Exception;
	
	protected void registerReload() throws Exception {
		reloadManager.register(ProjectData.class.getName(), projectData);
	}
	
	protected abstract byte createModel();
	
	protected ReloadManager createReloadManager() {
		return new ReloadManager(getTimer());
	}
	
	protected TitleManager createTitleManager() {
		TitleManager titleManager = new TitleManager();
		getSourceData().addListener(titleManager);
		return titleManager;
	}

	protected abstract ProjectData createProjectData();

	protected abstract ObjectReader<MapInfo> createMapReader();
	
	protected abstract URI loadServerFilePath() throws Exception;

	@Override
	public final int getVersion() {
		return version;
	}

	@Override
	public final byte getModel() {
		return model;
	}

	@Override
	public final ReloadManager getReloadManager() {
		return reloadManager;
	}

	@Override
	public final TitleManager getTitleManager() {
		return titleManager;
	}
	
	@Override
	public ProjectData getSourceData() {
		return projectData;
	}

}
