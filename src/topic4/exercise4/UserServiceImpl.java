package topic4.exercise4;

public class UserServiceImpl implements UserService {

	private UserInfo userInfo;

	@Override
	public String createUser(String name) {
		userInfo.setName(name);
		return name;
	}

	@Override
	public String findUser(String foundUser) {
		foundUser = userInfo.getName();
		return foundUser;
	}

	@Override
	public Boolean deleteUser(Boolean deletedUser) {
		if (userInfo.getName() == userInfo.getName() )
		{
			System.out.println("User" + userInfo + "deleted.");
		}
		return deletedUser;
	}

	@Override
	public Boolean updateUser(Boolean updatedUser) {
		if (userInfo.getName() == userInfo.getName() )
		{
			System.out.println("User" + userInfo + "updated.");
		}
		return updatedUser;
	}
	
}
