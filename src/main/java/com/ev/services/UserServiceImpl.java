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
		AuthResponse authResponse= null;
		User user1= userRepo.findByEmailIdAndPassword(user.getEmailId(), user.getPassword());
		if(user1!=null) {
			authResponse = new AuthResponse();
			authResponse.setUserName(user1.getUserName());
			authResponse.setEmailId(user1.getEmailId());
			authResponse.setAuthenticationStatus(true);
			authResponse.setAdmin(user1.getRole()=="admin");
			return authResponse;
		}
		else {
			throw new UserNotFoundException("User not found with emailId and password");
		}
	}

	

}