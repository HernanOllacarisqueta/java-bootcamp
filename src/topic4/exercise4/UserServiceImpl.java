package topic4.exercise4;

public class UserServiceImpl implements UserService {

	private UserInfo userInfo;
	
	protected UserServiceImpl() {
		userInfo = new UserInfo();
		
	}
	
	@Override
	public void createUser() {
		userInfo.setUser("Pepe");
		
	}

	@Override
	public void returnUserID() {
		userInfo.setUserID(2321);
		
	}

	@Override
	public void returnEmail() {
		userInfo.setUserEmail("pepe@pepepapa.com");		
	}
	

}
