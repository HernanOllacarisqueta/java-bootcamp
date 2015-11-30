package topic0.exercise2;

public class HouseConcrete implements HouseBuilder {

	private HouseProduct houseproduct;
	
	public HouseConcrete() {
		houseproduct = new HouseProduct();
	}
	
	@Override
	public void buildWall() {
		houseproduct.setWall("Ladrillo");
		
	}

	@Override
	public void buildFloor() {
		// TODO Auto-generated method stub
		houseproduct.setFloor("Piso");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		houseproduct.setRoof("Tejas");
	}

	@Override
	public HouseProduct getHouseProduct() {
		// TODO Auto-generated method stub
		return houseproduct;
	}

}