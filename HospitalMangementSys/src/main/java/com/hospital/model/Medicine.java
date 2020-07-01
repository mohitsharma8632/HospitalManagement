package com.hospital.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Medicine {
	
	@Id
	private String name;
	private int quantityAvaialable;
	
	@Column(precision=10, scale=2)
	@Type(type = "big_decimal")
	private double rate; // cost of the medicine
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantityAvaialable() {
		return quantityAvaialable;
	}

	public void setQuantityAvaialable(int quantityAvaialable) {
		this.quantityAvaialable = quantityAvaialable;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}


	
	
	
}
