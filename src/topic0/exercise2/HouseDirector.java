package topic0.exercise2;

public class HouseDirector {

	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructHouseProduct() {
		houseBuilder.buildFloor();
		houseBuilder.buildRoof();
		houseBuilder.buildWall();
	}

	public HouseProduct getHouseProduct() {
		return houseBuilder.getHouseProduct();
	}
}
