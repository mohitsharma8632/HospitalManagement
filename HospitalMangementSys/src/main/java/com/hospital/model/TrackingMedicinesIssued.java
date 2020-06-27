package com.hospital.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrackingMedicinesIssued {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int patientId;
	private int medicineId;
	private int quantityIssued;
	
	
	
	public TrackingMedicinesIssued() {
	}
	
	public TrackingMedicinesIssued(int patientId, int medicineId, int quantityIssued) {
		super();
		this.patientId = patientId;
		this.medicineId = medicineId;
		this.quantityIssued = quantityIssued;
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	public int getMedicineId() {
		return medicineId;
	}
	
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	
	public int getQuantityIssued() {
		return quantityIssued;
	}
	
	public void setQuantityIssued(int quantityIssued) {
		this.quantityIssued = quantityIssued;
	}
	
	
	
}
