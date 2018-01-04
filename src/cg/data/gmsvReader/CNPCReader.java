package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfNPC;
import cg.base.loader.IOCBeanType;
import cg.data.sprite.NpcTemplate;

@IOCBean(type=IOCBeanType.READER)
class CNPCReader extends BaseObjectReader<NpcTemplate, ConfNPC> {
	
	private static class CNpcTemplate implements NpcTemplate {
		
		private String type, name, talkType;
		
		private int id, mapId, resourcesId;
		
		private int[] coordinates;
		
		private byte dir, appearTime;

		@Override
		public String toString() {
			return getClass().getName() + " type = " + type + " ; name = " + name + " ; id = " + id + " ; mapId = " + mapId + " ; imageId = " + resourcesId + " ; talkType = " + talkType;
		}

		@Override
		public String getType() {
			return type;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public int getMapId() {
			return mapId;
		}

		@Override
		public int[] getCoordinates() {
			return coordinates;
		}

		@Override
		public int getResourcesId() {
			return resourcesId;
		}

		@Override
		public byte getDir() {
			return dir;
		}

		@Override
		public String getTalkType() {
			return talkType;
		}

		@Override
		public byte getAppearTime() {
			return appearTime;
		}

		@Override
		public int getRefreshTime() {
			return NO_REFRESH_TIME;
		}
		
	}

	@Override
	public void output(File outFile, Collection<NpcTemplate> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfNPC> getFromClass() {
		return ConfNPC.class;
	}

	@Override
	NpcTemplate transform(ConfNPC s) {
		CNpcTemplate ret = new CNpcTemplate();
		ret.type = s.getType();
		ret.name = s.getName();
		ret.id = s.getId();
		ret.mapId = s.getMapId();
		ret.coordinates = s.getCoordinates();
		ret.dir = s.getDir();
		ret.resourcesId = s.getResourcesId() == 0 ? -1 : s.getResourcesId();
		ret.appearTime = s.getAppearTime();
		ret.talkType = s.getTalkType();
		return ret;
	}

}
