package com.nandy.S03StereotypeAnnotations.model;

import org.springframework.stereotype.Component;

@Component
public class Patient {

	private int id;
	
	public Patient() {
		System.out.println("Inside patient constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the setter method for Id field");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	
}