package topic4.exercise4;

public class UserServiceWebServer implements UserService {

	UserService imp;
	
	@Override
	public String createUser(String name) {
		imp.createUser(name);
		return name;
	}

	@Override
	public String findUser(String foundName) {
		imp.createUser(foundName);
		return foundName;
	}

	@Override
	public Boolean deleteUser(Boolean deletedUser) {
		imp.deleteUser(deletedUser);
		return deletedUser;
	}

	@Override
	public Boolean updateUser(Boolean updatedUser) {
		imp.updateUser(updatedUser);
		return updatedUser;
	}

}
