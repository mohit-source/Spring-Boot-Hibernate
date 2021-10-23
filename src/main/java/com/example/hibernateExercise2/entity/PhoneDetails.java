package com.example.hibernateExercise2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PhoneDetails")
public class PhoneDetails {
	@Id
	@GeneratedValue
	private long id;
	
	private String provider;
	
	private String technology;

	public long getId() {
		return id;
	}

	public String getProvider() {
		return provider;
	}

	public String getTechnology() {
		return technology;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	 public String toString() {
		 return "PhoneDetails [id=" +id + ", Provider="+provider+", Technology =" +technology + "]";
	 }
}
