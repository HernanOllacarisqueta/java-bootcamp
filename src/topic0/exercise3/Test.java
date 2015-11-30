package topic0.exercise3;

public class Test {

	public static void main(String[] args) {
		
		BuildingFactory buildingfactory = new BuildingFactory();		
		ChosenFactory chosenfactory1 = buildingfactory.getChosenFactory("hospital");
		
		Building hospital1 = chosenfactory1.getHospital("hospital2");
		System.out.println("Build a: " + hospital1.makeName());

	}

}
