package com.ev.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ev.entities.Feedback;
import com.ev.entities.User;
import com.ev.repositories.FeedbackRepository;
import com.ev.services.FeedbackService;

@CrossOrigin
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	private FeedbackService feedbackService;
	
	private FeedbackRepository feedbackRepository;
	public FeedbackController(FeedbackRepository feedbackRepository,FeedbackService feedbackService) {
		super();
		this.feedbackRepository = feedbackRepository;
		this.feedbackService=feedbackService;
	}

	@PostMapping("/addFeedback")
    public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback){
	
		return new ResponseEntity<Feedback>(feedbackService.addFeedback(feedback),HttpStatus.CREATED);
	
	}
	
	@GetMapping("/getFeedback")
	public ResponseEntity<ArrayList<Feedback>> getFeedback(@RequestParam User userId){
	
		return new ResponseEntity<ArrayList<Feedback>>(feedbackService.getFeedback(userId),HttpStatus.FOUND);
	
	}
	@GetMapping("/getAllFeedback")
	public ResponseEntity<List<Feedback>> getFeedback(){
	
		return new ResponseEntity<List<Feedback>>(feedbackRepository.findAll(),HttpStatus.FOUND);
	
	}
}
