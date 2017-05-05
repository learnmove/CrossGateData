package cg.data.resource.inputStream;

import java.io.InputStream;
import java.net.URI;

import org.apache.poi.ss.usermodel.Workbook;
import org.tool.server.utils.ExcelUtil;

import cg.base.util.URLHandler;

class ExcelInputStreamHandler extends TypeInputStreamHandler<Workbook> implements URLHandler {
	
	private Workbook workbook;
	
	public ExcelInputStreamHandler(String type) {
		super(type);
	}

	@Override
	protected Workbook get(URI uri) throws Exception {
		try {
			getStream(uri, this);
			return workbook;
		} finally {
			workbook = null;
		}
	}

	@Override
	public void handle(InputStream is, String info) throws Exception {
		workbook = ExcelUtil.getWorkbook(is, info);
		log.info(info);
	}

}
