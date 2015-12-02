package topic4.exercise4;

public class UserServiceProxy implements UserService{

	UserService implementation;
	
	protected UserServiceProxy(UserService imp){
		this.implementation = imp;	
	}

	@Override
	public String createUser(String name) {
		implementation.createUser(name);
		return name;
	}

	@Override
	public String findUser(String foundName) {
		implementation.createUser(foundName);
		return foundName;
	}

	@Override
	public Boolean deleteUser(Boolean deletedUser) {
		implementation.deleteUser(deletedUser);
		return deletedUser;
	}

	@Override
	public Boolean updateUser(Boolean updatedUser) {
		implementation.updateUser(updatedUser);
		return updatedUser;
	}
	
}
