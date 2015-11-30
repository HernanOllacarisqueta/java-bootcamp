package topic4.exercise4;

public class UserServiceWebServerClient implements UserService {

	UserService webService;
	
	@Override
	public void createUser() {
		webService.createUser();
		
	}

	@Override
	public void returnUserID() {
		webService.returnUserID();
		
	}

	@Override
	public void returnEmail() {
		webService.returnEmail();
		
	}

}
