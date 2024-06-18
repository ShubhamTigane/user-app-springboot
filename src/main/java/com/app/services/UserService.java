package com.app.services;

import com.app.entities.User;

public interface UserService {

	User registerUser(User user);
	
	User fetchUserByUsername(String username);
}
