package com.ev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="feedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",updatable=false,nullable=false)
	private Long id;
	
	@Column(name="text_field",length=128)
	private String textField;
	
	@Column(name="rating")
	private int rating;
	
	@ManyToOne
	@JoinColumn(name="user_Id")
	private User userId;//cascade
	
	public Feedback()
	{
		
	}
	
	public Feedback(String textField,int rating,User userId)
	{
		super();
		this.textField=textField;
		this.rating=rating;
		this.userId=userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTextField() {
		return textField;
	}

	public void setTextField(String textField) {
		this.textField = textField;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}
	
}

	



