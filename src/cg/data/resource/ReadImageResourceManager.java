package cg.data.resource;

import cg.base.conf.ConfImage;
import cg.base.conf.IConfImage;
import cg.base.image.CImageManager;
import cg.base.io.CImageResource;
import cg.base.reader.CImageReader;
import cg.base.reader.ImageReader;

public class ReadImageResourceManager extends CImageManager implements ProjectDataListener {

	public ReadImageResourceManager(String clientFilePath) {
		super(clientFilePath);
	}

	@Override
	public void reload(ProjectData projectData) throws Exception {
		resources.clear();
		for (IConfImage conf : ConfImage.arrayFromExcel(projectData)) {
			addResource(new CImageResource(conf.getVersion(), conf.getType(), conf.getPath(), conf.getSuffix(), 
					conf.getName(), conf.getPalette().toLowerCase().equals("true")));
		}
		imageReader.load();
	}

	@Override
	protected ImageReader createImageReader(String clientFilePath) {
		return new CImageReader(this, clientFilePath);
	}

}
