package com.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hospital.model.*;
import com.hospital.repositories.PatientRepository;
@Controller
public class PatientController {

	@Autowired
	PatientRepository patientRepository; 
	
	
	
	
	@RequestMapping("/patientRegistrationForm")
	public ModelAndView registerPatient() {
		return new ModelAndView("patientRegistrationForm");
	}
	
	@RequestMapping(value="/patientRegistrationForm",method=RequestMethod.POST)
	public ModelAndView patientRegistered(Patient p) {
		ModelAndView md = new ModelAndView("patientRegistrationForm");
//		if dao method save successfully then add this msge
		try {
		patientRepository.save(p);
		md.addObject("msge", "Patient creation initiated successfully");
		}catch(Error e) {
//			else add msge to error object returned by it
			md.addObject("msge","error")
			;
			}
		return md;
	}
	
	@RequestMapping("/updatePatientForm")
	public ModelAndView updatePatient() {
		return new ModelAndView("updatePatientForm");
	}
	
	@RequestMapping(value="/updatePatientForm",method=RequestMethod.POST)
	public ModelAndView patientUpdated(Patient p) {
		ModelAndView md = new ModelAndView("updatePatientForm");
//		if dao method updated successfully then add this msge
		try {
		patientRepository.save(p);
		md.addObject("msge", "Patient update initiated successfully");}
//		else add msge to error object returned by it
		catch(Error e) {
		md.addObject("msge","error");
		}
		return md;
	}
	
	@RequestMapping("/deletePatientForm")
	public ModelAndView deletePatient() {
		return new ModelAndView("deletePatientForm");
	}
	
	@RequestMapping(value="/deletePatientForm",method=RequestMethod.POST)
	public ModelAndView patientDeleted(Patient p) {
		ModelAndView md = new ModelAndView("deletePatientForm");
//		if dao method updated successfully then add this msge
		try {
		patientRepository.delete(p);
		md.addObject("msge", "Patient deletion initiated successfully");
		}catch(Error e) {
			//		else add msge to error object returned by it

			md.addObject("msge","error");
			}
		return md;
	}
	
	@RequestMapping("/viewPatients")
	public ModelAndView getAllPatientsDetails() {
		ModelAndView md=new ModelAndView("listPatients");
		ArrayList<Patient> plist=(ArrayList<Patient>) patientRepository.findAll();
		md.addObject("plist", plist);
		return new ModelAndView("listPatients");
	}
	
	@RequestMapping("/patientDetailsForm")
	public ModelAndView getPatientDetails() {
		return new ModelAndView("patientDetails");
	}
	
	
}
