package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfBoxContains;
import cg.base.loader.IOCBeanType;
import cg.data.map.BoxContains;

@IOCBean(type=IOCBeanType.READER)
class CBoxContainsReader extends BaseObjectReader<BoxContains, ConfBoxContains> {
	
	private static final byte DEFAULT_COUNT = 1;
	
	private static class CBoxContains implements BoxContains {
		
		private byte id, count, rate;
		
		private int value;
		
		private String type;

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

	@Override
	protected Class<ConfBoxContains> getFromClass() {
		return ConfBoxContains.class;
	}

	@Override
	protected BoxContains transform(ConfBoxContains s) {
		CBoxContains ret = new CBoxContains();
		ret.id = s.getId();
		ret.value = s.getValue();
		ret.count = (byte) Math.max(DEFAULT_COUNT, s.getCount());
		ret.rate = s.getRate();
		ret.type = s.getType();
		return ret;
	}

}
