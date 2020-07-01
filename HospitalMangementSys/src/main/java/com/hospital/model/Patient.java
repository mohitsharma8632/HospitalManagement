package com.hospital.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "SSNID", unique=true, nullable=false)
	private String ssnId;
	
	private String name;
	private int age;
	
	private String dateOfAdmission;
	
	private String typeOfBed;
	private String address;
	private String city;
	private String state;
	private boolean status;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSsnId() {
		return ssnId;
	}


	public void setSsnId(String ssnId) {
		this.ssnId = ssnId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDateOfAdmission() {
		return dateOfAdmission;
	}


	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}


	public String getTypeOfBed() {
		return typeOfBed;
	}


	public void setTypeOfBed(String typeOfBed) {
		this.typeOfBed = typeOfBed;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
	 
}
