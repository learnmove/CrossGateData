package cg.data.map;

public interface Warp {
	
	int getId();
	
	int getSourceMapId();
	
	int getTargetMapId();
	
	int getSourceMapEast();
	
	int getSourceMapSouth();
	
	int getTargetMapEast();
	
	int getTargetMapSouth();
	
	int getResourceGlobalId();
	
	static Warp createWarp(int id, int sourceMapId, int sourceMapEast, int sourceMapSouth, int targetMapId, int targetMapEast, int targetMapSouth) {
		return createWarp(targetMapId, sourceMapId, sourceMapEast, sourceMapSouth, targetMapId, targetMapEast, targetMapSouth, 0);
	}
	
	static Warp createWarp(int id, int sourceMapId, int sourceMapEast, int sourceMapSouth, int targetMapId, int targetMapEast, int targetMapSouth, int resourceGlobalId) {
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

}

final class CWarp implements Warp {
	
	private int id;
	
	private int sourceMapId;
	
	private int targetMapId;
	
	private int sourceMapEast;
	
	private int sourceMapSouth;
	
	private int targetMapEast;
	
	private int targetMapSouth;
	
	private int resourceGlobalId;

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
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSourceMapId(int sourceMapId) {
		this.sourceMapId = sourceMapId;
	}
	
	public void setSourceMapEast(int sourceMapEast) {
		this.sourceMapEast = sourceMapEast;
	}
	
	public void setSourceMapSouth(int sourceMapSouth) {
		this.sourceMapSouth = sourceMapSouth;
	}
	
	public void setTargetMapId(int targetMapId) {
		this.targetMapId = targetMapId;
	}
	
	public void setTargetMapEast(int targetMapEast) {
		this.targetMapEast = targetMapEast;
	}
	
	public void setTargetMapSouth(int targetMapSouth) {
		this.targetMapSouth = targetMapSouth;
	}
	
	public void setResourceGlobalId(int resourceGlobalId) {
		this.resourceGlobalId = resourceGlobalId;
	}

	@Override
	public String toString() {
		return "{Warp[" + id + "]:from (" + sourceMapId + "," + sourceMapEast + "," + sourceMapSouth + ") to (" + targetMapId + "," + targetMapEast + "," + targetMapSouth + ").";
	}
	
}
