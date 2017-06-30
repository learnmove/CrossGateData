package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfNPC;
import cg.base.conf.IConfNPC;
import cg.base.loader.IOCBeanType;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.NpcTemplate;

@IOCBean(type=IOCBeanType.READER)
class CNPCReader implements ObjectReader<NpcTemplate> {

	@Override
	public List<NpcTemplate> read(ProjectData projectData) {
		return ObjectReader.transform(ConfNPC.arrayFromExcel(projectData), s -> { return new CNpcTemplate(s); });
	}
	
	private static class CNpcTemplate implements NpcTemplate {
		
		private String type, name, talkType;
		
		private int id, mapId, resourcesId;
		
		private int[] coordinates;
		
		private byte dir, appearTime;
		
		public CNpcTemplate(IConfNPC conf) {
			type = conf.getType();
			name = conf.getName();
			id = conf.getId();
			mapId = conf.getMapId();
			coordinates = conf.getCoordinates();
			dir = conf.getDir();
			resourcesId = conf.getResourcesId() == 0 ? -1 : conf.getResourcesId();
			appearTime = conf.getAppearTime();
			talkType = conf.getTalkType();
		}

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

}
