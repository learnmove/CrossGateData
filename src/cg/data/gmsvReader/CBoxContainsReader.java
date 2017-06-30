package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfBoxContains;
import cg.base.conf.IConfBoxContains;
import cg.base.loader.IOCBeanType;
import cg.data.map.BoxContains;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

@IOCBean(type=IOCBeanType.READER)
class CBoxContainsReader implements ObjectReader<BoxContains> {
	
	@Override
	public List<BoxContains> read(ProjectData projectData) {
		return ObjectReader.transform(ConfBoxContains.arrayFromExcel(projectData), s -> { return new CBoxContains(s); });
	}
	
	private static class CBoxContains implements BoxContains {
		
		private static final byte DEFAULT_COUNT = 1;
		
		private byte id, count, rate;
		
		private int value;
		
		private String type;
		
		public CBoxContains(IConfBoxContains conf) {
			id = conf.getId();
			value = conf.getValue();
			count = (byte) Math.max(DEFAULT_COUNT, conf.getCount());
			rate = conf.getRate();
			type = conf.getType();
		}

		@Override
		public byte getId() {
			return id;
		}

		@Override
		public int getValue() {
			return value;
		}

		@Override
		public byte getCount() {
			return count;
		}

		@Override
		public byte getRate() {
			return rate;
		}

		@Override
		public String getType() {
			return type;
		}
		
	}

	@Override
	public void output(File outFile, Collection<BoxContains> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
