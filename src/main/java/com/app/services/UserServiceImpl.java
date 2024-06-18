package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.User;
import com.app.exception.UserNotFoundException;
import com.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User fetchUserByUsername(String username) {

		return userRepository.findByUsername(username)
				.orElseThrow(() -> new UserNotFoundException("user '" + username + "' not found"));
	}

}
