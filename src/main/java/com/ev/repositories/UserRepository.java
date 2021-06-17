package com.ev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ev.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>  {
	User findByUserNameAndPassword(String userName,String password);
	User findByUserName(String userName);
	User findById(int id);
}
