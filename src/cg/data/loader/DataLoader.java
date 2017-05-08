package cg.data.loader;

import java.net.URI;

import cg.base.loader.Loader;
import cg.data.gmsvReader.GMSVReaders;
import cg.data.map.CWarpManager;
import cg.data.map.MapReader;
import cg.data.map.WarpManager;
import cg.data.newReader.NewReaders;
import cg.data.resource.MessageManager;
import cg.data.resource.ProjectData;
import cg.data.resource.ReloadManager;
import cg.data.title.TitleManager;

public abstract class DataLoader extends Loader implements IDataPlatform {
	
	protected ReloadManager reloadManager;
	
	protected ProjectData projectData;
	
	protected MessageManager messageManager;

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
		messageManager = createMessageManager();
		registerReload();
		loadData();
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
	
	private void loadData() {
		projectData.addObjectReader(GMSVReaders.createBoxContainsReader());
		projectData.addObjectReader(GMSVReaders.createDungeonReader());
		projectData.addObjectReader(GMSVReaders.createEncountInfoReader());
		projectData.addObjectReader(GMSVReaders.createEnemyAiReader());
		projectData.addObjectReader(GMSVReaders.createEnemyBaseInfoReader());
		projectData.addObjectReader(GMSVReaders.createEnemyGroupReader());
		projectData.addObjectReader(GMSVReaders.createEnemyReader());
		projectData.addObjectReader(GMSVReaders.createEnemyTalkReader());
		projectData.addObjectReader(GMSVReaders.createGarbledReader());
		projectData.addObjectReader(GMSVReaders.createGatherAreaReader());
		projectData.addObjectReader(GMSVReaders.createItemReader(messageManager));
		projectData.addObjectReader(GMSVReaders.createItemRecipeReader());
		projectData.addObjectReader(GMSVReaders.createJobReader());
		projectData.addObjectReader(GMSVReaders.createMessageReader());
		projectData.addObjectReader(GMSVReaders.createNPCReader());
		projectData.addObjectReader(GMSVReaders.createSkillDataReader(messageManager));
		projectData.addObjectReader(GMSVReaders.createSkillTemplateReader(messageManager));
		projectData.addObjectReader(GMSVReaders.createTitleConfigReader());
		projectData.addObjectReader(GMSVReaders.createTitleReader());
		projectData.addObjectReader(GMSVReaders.createWarpReader());
		projectData.addObjectReader(NewReaders.createRoleAnimationInfoReader());
	}
	
	protected abstract byte createModel();
	
	protected ReloadManager createReloadManager() {
		return new ReloadManager(getTimer());
	}
	
	protected MessageManager createMessageManager() {
		MessageManager messageManager = new MessageManager();
		getSourceData().addListener(messageManager);
		return messageManager;
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
		return GMSVReaders.createFileMapReader("map", this);
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
	public final MessageManager getMessageManager() {
		return messageManager;
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
