package cg.data.loader;

import java.net.URI;

import cg.base.loader.Builder;
import cg.data.gmsvReader.CFileMapReader;
import cg.data.map.CWarpManager;
import cg.data.map.MapReader;
import cg.data.map.WarpManager;
import cg.data.resource.ProjectData;
import cg.data.resource.ReloadManager;
import cg.data.title.TitleManager;

public abstract class DataBuilder extends Builder implements IDataPlatform {
	
	protected ReloadManager reloadManager;
	
	protected ProjectData projectData;

	protected byte model;
	
	protected TitleManager titleManager;
	
	protected WarpManager warpManager;
	
	protected MapReader mapReader;
	
	protected URI serverFilePath;

	@Override
	protected final void loadMore() throws Exception {
		serverFilePath = loadServerFilePath();
		model = createModel();
		reloadManager = createReloadManager();
		projectData = createProjectData();
		registerReload();
		reloadManager.reload();
		titleManager = createTitleManager();
		warpManager = createWarpManager();
		mapReader = createMapReader();
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

	protected WarpManager createWarpManager() {
		return new CWarpManager(getSourceData());
	}

	protected MapReader createMapReader() {
		return new CFileMapReader("map", this);
	}
	
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
	public final WarpManager getWarpManager() {
		return warpManager;
	}

	@Override
	public final MapReader getMapReader() {
		return mapReader;
	}
	
	@Override
	public ProjectData getSourceData() {
		return projectData;
	}

}
