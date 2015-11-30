package topic0.exercise3;

public class HospitalFactory extends ChosenFactory {

	@Override
	public Building getHospital(String type) {
		if ("hospital2".equals(type)) {
			return new Hospital();
		} else {
			return null;
		}

	}
	
}

