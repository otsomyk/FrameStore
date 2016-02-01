package car;

public enum Model {
	RENAULT(1), MAZDA(2), FORD(3), TESLA(4), AUDI(5);

	private int id;

	private Model(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}
}
