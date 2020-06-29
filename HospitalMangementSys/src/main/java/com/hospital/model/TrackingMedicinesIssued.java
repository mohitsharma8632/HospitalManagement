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
	
	@ManyToOne
	@JoinColumn(name="Medicine_Id")
	private Medicine medicine;
	
	private int quantityIssued;
	
	
	
	public TrackingMedicinesIssued() {
	}
	
	public TrackingMedicinesIssued(int patientId, Medicine medicine, int quantityIssued) {
		super();
		this.patientId = patientId;
		this.medicine = medicine;
		this.quantityIssued = quantityIssued;
	}



	
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
	
	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public int getQuantityIssued() {
		return quantityIssued;
	}
	
	public void setQuantityIssued(int quantityIssued) {
		this.quantityIssued = quantityIssued;
	}
	
	
	
}
