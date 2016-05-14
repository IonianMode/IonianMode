package eu.raffaelebua.ionian_mode.service;

import eu.raffaelebua.ionian_mode.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);

	void createUser(User user);
	
}