package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfWarp;
import cg.base.conf.IConfWarp;
import cg.base.loader.IOCBeanType;
import cg.data.map.Warp;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

@IOCBean(type=IOCBeanType.READER)
class CWarpReader implements ObjectReader<Warp> {
	
	@Override
	public List<Warp> read(ProjectData projectData) {
		return ObjectReader.transform(ConfWarp.arrayFromExcel(projectData), s -> { return new CWarp(s); });
	}
	
	public static Warp createWarp(int id, int sourceMapId, int sourceMapEast, int sourceMapSouth, int targetMapId, int targetMapEast, int targetMapSouth, int resourceGlobalId) {
		CWarp warp = new CWarp();
		warp.setId(id);
		warp.setSourceMapId(sourceMapId);
		warp.setSourceMapEast(sourceMapEast);
		warp.setSourceMapSouth(sourceMapSouth);
		warp.setTargetMapId(targetMapId);
		warp.setTargetMapEast(targetMapEast);
		warp.setTargetMapSouth(targetMapSouth);
		warp.setResourceGlobalId(resourceGlobalId);
		return warp;
	}
	
	private static class CWarp implements Warp {
		
		private int id;
		
		private int sourceMapId;
		
		private int targetMapId;
		
		private int sourceMapEast;
		
		private int sourceMapSouth;
		
		private int targetMapEast;
		
		private int targetMapSouth;
		
		private int resourceGlobalId;
		
		public CWarp(IConfWarp conf) {
			this();
			setId(conf.getId());
			setSourceMapId(conf.getSourceMapId());
			setSourceMapEast(conf.getSourceMapEast());
			setSourceMapSouth(conf.getSourceMapSouth());
			setTargetMapId(conf.getTargetMapId());
			setTargetMapEast(conf.getTargetMapId());
			setTargetMapSouth(conf.getTargetMapSouth());
		}
		
		public CWarp() {};

		@Override
		public int getId() {
			return id;
		}

		@Override
		public int getSourceMapId() {
			return sourceMapId;
		}

		@Override
		public int getTargetMapId() {
			return targetMapId;
		}

		@Override
		public int getSourceMapEast() {
			return sourceMapEast;
		}

		@Override
		public int getSourceMapSouth() {
			return sourceMapSouth;
		}

		@Override
		public int getTargetMapEast() {
			return targetMapEast;
		}

		@Override
		public int getTargetMapSouth() {
			return targetMapSouth;
		}

		@Override
		public int getResourceGlobalId() {
			return resourceGlobalId;
		}
		
		private void setId(int id) {
			this.id = id;
		}
		
		private void setSourceMapId(int sourceMapId) {
			this.sourceMapId = sourceMapId;
		}
		
		private void setSourceMapEast(int sourceMapEast) {
			this.sourceMapEast = sourceMapEast;
		}
		
		private void setSourceMapSouth(int sourceMapSouth) {
			this.sourceMapSouth = sourceMapSouth;
		}
		
		private void setTargetMapId(int targetMapId) {
			this.targetMapId = targetMapId;
		}
		
		private void setTargetMapEast(int targetMapEast) {
			this.targetMapEast = targetMapEast;
		}
		
		private void setTargetMapSouth(int targetMapSouth) {
			this.targetMapSouth = targetMapSouth;
		}
		
		private void setResourceGlobalId(int resourceGlobalId) {
			this.resourceGlobalId = resourceGlobalId;
		}

		@Override
		public String toString() {
			return "{Warp[" + id + "]:from (" + sourceMapId + "," + sourceMapEast + "," + sourceMapSouth + ") to (" + targetMapId + "," + targetMapEast + "," + targetMapSouth + ").";
		}
		
	}

	@Override
	public void output(File outFile, Collection<Warp> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
