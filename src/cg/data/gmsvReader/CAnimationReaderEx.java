package cg.data.gmsvReader;

import cg.base.reader.CAnimationReader;
import cg.base.time.Time;
import cg.data.resource.ProjectData;
import cg.data.resource.ProjectDataListener;

public class CAnimationReaderEx extends CAnimationReader implements ProjectDataListener {

	public CAnimationReaderEx(String clientFilePath, Time timer) {
		super(clientFilePath, timer);
	}

	@Override
	public void reload(ProjectData projectData) throws Exception {
		load(projectData.getImageManager());
	}

}
