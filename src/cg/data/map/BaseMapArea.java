package cg.data.map;

public class BaseMapArea implements MapArea {

	private int mapId, west, north, east, south;
	
	public BaseMapArea(int mapId, int west, int north, int east, int south) {
		this.mapId = mapId;
		this.west = west;
		this.north = north;
		this.east = east;
		this.south = south;
	}

	@Override
	public int getMapId() {
		return mapId;
	}

	@Override
	public int getWest() {
		return west;
	}

	@Override
	public int getNorth() {
		return north;
	}

	@Override
	public int getEast() {
		return east;
	}

	@Override
	public int getSouth() {
		return south;
	}

	@Override
	public String toString() {
		return "ReaderMapArea[" + getMapId() + "](" + getWest() + "," + getNorth() + ") to (" + getEast() + "," + getSouth() + ").";
	}

}
