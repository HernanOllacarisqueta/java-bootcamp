package topic0.exercise3;

public class BuildingFactory {

	public ChosenFactory getChosenFactory(String type) {
		
		if ("hospital".equals(type)) {
			return new HospitalFactory();
		} else {
			return null;
		}
		
	}
	
}
