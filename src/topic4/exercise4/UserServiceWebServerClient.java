package topic4.exercise4;

public class UserServiceWebServerClient implements UserService {

	UserService webService;
	
	@Override
	public String createUser(String name) {
		webService.createUser(name);
		return name;
	}

	@Override
	public String findUser(String foundName) {
		webService.createUser(foundName);
		return foundName;
	}

	@Override
	public Boolean deleteUser(Boolean deletedUser) {
		webService.deleteUser(deletedUser);
		return deletedUser;
	}

	@Override
	public Boolean updateUser(Boolean updatedUser) {
		webService.updateUser(updatedUser);
		return updatedUser;
	}

}
