package com.hospital.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "MedicinesMaster")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private int quantityAvaialable;
	
	@Column(precision=10, scale=2)
	@Type(type = "big_decimal")
	private double rate; // cost of the medicine
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="medicine")
	private List<TrackingMedicinesIssued> trackingMedicinesIssued;
	
	public Medicine(String name, int quantityAvaialable, double rate) {
		super();
		this.name = name;
		this.quantityAvaialable = quantityAvaialable;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public List<TrackingMedicinesIssued> getTrackingMedicinesIssued() {
		return trackingMedicinesIssued;
	}

	public void setTrackingMedicinesIssued(List<TrackingMedicinesIssued> trackingMedicinesIssued) {
		this.trackingMedicinesIssued = trackingMedicinesIssued;
	}
	
	
	
	
}
