package cg.data.resource;

import cg.base.conf.ConfImage;
import cg.base.conf.IConfImage;
import cg.base.image.CImageManager;
import cg.base.image.ImageReader;
import cg.base.io.CImageResource;
import cg.base.reader.CImageReader;

public class ReadImageResourceManager extends CImageManager implements ProjectDataListener {
	
	protected final String clientFilePath;

	public ReadImageResourceManager(String clientFilePath) {
		super(clientFilePath);
		this.clientFilePath = clientFilePath;
	}

	@Override
	public void reload(ProjectData projectData) throws Exception {
		resources.clear();
		for (IConfImage conf : ConfImage.arrayFromExcel(projectData)) {
			addResource(new CImageResource(conf.getVersion(), conf.getType(), conf.getPath(), conf.getSuffix(), 
					conf.getName(), conf.getPalette().toLowerCase().equals("true")));
		}
		imageReader = createImageReader(clientFilePath);
	}

	@Override
	protected ImageReader createImageReader(String clientFilePath) {
		return resources.size() == 0 ? null : createImageReader();
	}
	
	protected ImageReader createImageReader() {
		return new CImageReader(this, clientFilePath);
	}

}
