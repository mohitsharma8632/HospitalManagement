package com.hospital.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TrackingMedicinesIssued {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int patientId;
	
	private String medicine;
	
	private int quantityIssued;
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public int getQuantityIssued() {
		return quantityIssued;
	}
	
	public void setQuantityIssued(int quantityIssued) {
		this.quantityIssued = quantityIssued;
	}
	
	
	
}
