package topic4.exercise4;

public class UserServiceProxy implements UserService{

	UserService implementation;
	
	protected UserServiceProxy(UserService imp){
		this.implementation = imp;	
	}
	
	@Override
	public void createUser() {
		implementation.createUser();
		
	}

	@Override
	public void returnUserID() {
		implementation.returnUserID();
		
	}

	@Override
	public void returnEmail() {
		implementation.returnEmail();
		
	}
	
}
