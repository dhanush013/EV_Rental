package com.ev.services;

import org.springframework.stereotype.Service;

import com.ev.repositories.UserRepository;
import com.ev.model.AuthResponse;
import com.ev.entities.User;
import com.ev.exceptions.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepo;
	
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public User registerUser(User user) {
		User user1=userRepo.save(user);
		return user;
	}

	@Override
	public AuthResponse validate(User user) throws UserNotFoundException {
		AuthResponse authReponse = null;
		User user1=userRepo.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(user1!=null) {
			authReponse=new AuthResponse();
			authReponse.setUserName(user1.getUserName());
			authReponse.setAuthenticationStatus(true);
			authReponse.setRole(user1.getRole());
			return authReponse;
		}
		else
		{
			throw new UserNotFoundException("User not found with username and password");
		}
	}

	

}