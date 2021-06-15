package com.ev.services;

import java.util.ArrayList;

import com.ev.entities.Feedback;
import com.ev.entities.User;



public interface FeedbackService {
	Feedback addFeedback(Feedback feedback );
	ArrayList<Feedback> getFeedback(User userId);

}

