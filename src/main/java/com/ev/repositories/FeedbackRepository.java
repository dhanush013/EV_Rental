package com.ev.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ev.entities.Feedback;
import com.ev.entities.User;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
	ArrayList<Feedback> findByUserId(User userId);
}
