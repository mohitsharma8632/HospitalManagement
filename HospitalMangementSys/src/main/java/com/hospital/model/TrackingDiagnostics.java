package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Test_Conducted")
public class TrackingDiagnostics {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int patientId;
	private int testConductedId;
	
	@ManyToOne
	@JoinColumn(name="Diagnotics_Id")
	private Diagnostics diagnostics;
	
	public TrackingDiagnostics(int patientId, int testConductedId) {
		super();
		this.patientId = patientId;
		this.testConductedId = testConductedId;
	}

	public TrackingDiagnostics() {
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

	public int getTestConductedId() {
		return testConductedId;
	}

	public void setTestConductedId(int testConductedId) {
		this.testConductedId = testConductedId;
	}

	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	public void setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}
	
	
	
	
	
}
