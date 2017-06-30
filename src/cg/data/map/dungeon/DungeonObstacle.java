package cg.data.map.dungeon;

public class DungeonObstacle {
	
	private int imageGlobalId;
	
	private byte[] rates;
	
	public void load(int imageGlobalId, byte[] rates) {
		this.imageGlobalId = imageGlobalId;
		this.rates = rates;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{imageGlobalId = " + imageGlobalId + " [");
		for (byte rate : rates) {
			builder.append(rate + ", ");
		}
		builder.append("]}");
		return builder.toString();
	}
	
	public int getImageGlobalId() {
		return imageGlobalId;
	}
	
	public byte[] getRates() {
		return rates;
	}

}
