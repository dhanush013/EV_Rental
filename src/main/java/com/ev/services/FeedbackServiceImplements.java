package com.ev.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ev.entities.Feedback;
import com.ev.entities.User;
import com.ev.repositories.FeedbackRepository;

@Service
public class FeedbackServiceImplements implements FeedbackService {
   private FeedbackRepository feedbackRepository;
   public FeedbackServiceImplements(FeedbackRepository feedbackRepository) {
	super();
	this.feedbackRepository = feedbackRepository;
}

	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
	  Feedback feedback1=feedbackRepository.save(feedback);	
		return feedback1;
	}

	@Override
	public ArrayList<Feedback> getFeedback(User userId) {
		// TODO Auto-generated method stub
		ArrayList<Feedback> s=feedbackRepository.findByUserId(userId);
		
		return s;
	}

}
