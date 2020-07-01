package com.hospital.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diagnostics {

	@Id
	private String name;
	private double charge;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getCharge() {
		return charge;
	}


	public void setCharge(double charge) {
		this.charge = charge;
	}
	
	
}
