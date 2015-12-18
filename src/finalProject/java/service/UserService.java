package service;

import model.User;

public interface UserService {
		
		public boolean addUser(User user);
		public User getUser(int id);
		public boolean updateUser(User user);
		
		
}
