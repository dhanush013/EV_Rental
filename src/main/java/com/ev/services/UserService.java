package com.ev.services;

import org.springframework.stereotype.Service;

import com.ev.entities.User;
import com.ev.exceptions.UserNotFoundException;
import com.ev.model.AuthResponse;
import com.ev.model.Login;

public interface UserService {
	User registerUser(User user);
	AuthResponse validate(User user) throws UserNotFoundException;
}
