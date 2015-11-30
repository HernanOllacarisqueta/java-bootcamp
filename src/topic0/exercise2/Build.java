package topic0.exercise2;

public class Build {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HouseBuilder houseBuilder = new HouseConcrete();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouseProduct();
		HouseProduct houseproduct = houseDirector.getHouseProduct();
		System.out.println("House is being build: " + houseproduct);	
		
	}

}
