package com.ev.services;

import org.springframework.stereotype.Service;

import com.ev.entities.User;
import com.ev.model.Login;

@Service
public interface UserService {
	
	void addUser(User user);
	
	User validateUser(Login login);

}
