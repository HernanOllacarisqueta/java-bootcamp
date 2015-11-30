package topic4.exercise4;

public class UserServiceWebServer implements UserService {

	UserService imp;
	
	@Override
	public void createUser() {
		imp.createUser();
		
	}

	@Override
	public void returnUserID() {
		imp.returnUserID();
		
	}

	@Override
	public void returnEmail() {
		imp.returnEmail();
		
	}

}
