package cg.data.resource;

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
		projectData.read(IConfImage.class).forEach(confImage -> addResource(
				new CImageResource(confImage.getVersion(), confImage.getType(), confImage.getPath(), confImage.getSuffix(), 
					confImage.getName(), confImage.getPalette().toLowerCase().equals("true"))));
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
