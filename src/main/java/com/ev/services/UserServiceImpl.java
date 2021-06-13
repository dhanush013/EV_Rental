package com.ev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ev.repositories.UserRepository;
import com.ev.model.Login;
import com.ev.entities.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepository userRepo;
	
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	public User validateUser(Login login){
		return userRepo.findById(login.getUsername()).get();
	}
	

}