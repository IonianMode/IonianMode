package eu.raffaelebua.ionian_mode.dao;

import eu.raffaelebua.ionian_mode.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

