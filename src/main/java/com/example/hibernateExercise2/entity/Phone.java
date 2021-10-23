package com.example.hibernateExercise2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name ="Phone")
public class Phone {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="phone_number")
	private String number;
	
	@OneToOne
	@JoinColumn(name="details_id")
	private PhoneDetails details;

	public long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public PhoneDetails getDetails() {
		return details;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setDetails(PhoneDetails details) {
		this.details = details;
	}
	
	 public String toString() {
		 return "Phone [id=" +id + ", Number="+number+", Phone Details =" +details + "]";
	 }
}
