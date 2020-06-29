package com.hospital.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Diagnostics_Master")
public class Diagnostics {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double charge;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="diagnostics")
	private List<TrackingDiagnostics> trackingDiagnostics;
	
	
	public Diagnostics() {
	}


	public Diagnostics(String name, double charge) {
		super();
		this.name = name;
		this.charge = charge;
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


	public double getCharge() {
		return charge;
	}


	public void setCharge(double charge) {
		this.charge = charge;
	}


	public List<TrackingDiagnostics> getTrackingDiagnostics() {
		return trackingDiagnostics;
	}


	public void setTrackingDiagnostics(List<TrackingDiagnostics> trackingDiagnostics) {
		this.trackingDiagnostics = trackingDiagnostics;
	}
	
	
	
}
