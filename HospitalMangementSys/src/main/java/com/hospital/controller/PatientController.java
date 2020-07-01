package com.hospital.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hospital.model.*;
import com.hospital.repositories.PatientRepository;
@Controller
public class PatientController {

	@Autowired
	PatientRepository patientRepository; 
	
	@GetMapping("patientRegistrationForm")
	public ModelAndView registerPatient() {

		return new ModelAndView("patientRegistrationForm");
	}
	
	@PostMapping("patientRegistrationForm")
	public ModelAndView patientRegistered(Patient p) {
		System.out.println("was here");
		ModelAndView md = new ModelAndView("header");
try {
	p=	patientRepository.save(p);
		md.addObject("msg", "Patient creation initiated successfully with id"+p.getId());
		}catch(Error e) {
			md.addObject("msg","error");
			}
		return md;
	}
	
	@GetMapping("updatePatientForm")
	public ModelAndView updatePatient() {
		ModelAndView md=new ModelAndView("updatePatientForm");
		md.addObject("to","updatePatientForm");
		return md;
	}
	
	@PostMapping("updatePatientForm")
	public ModelAndView patientUpdated(Patient p) {
		ModelAndView md = new ModelAndView("header");
try {
		patientRepository.save(p);
		md.addObject("msg", "Patient update initiated successfully");}
	catch(Error e) {
		md.addObject("msg","error");
		}
		return md;
	}
	
	@GetMapping("deletePatientForm")
	public ModelAndView deletePatient() {
		return new ModelAndView("deletePatientForm");
	}
	
	@PostMapping("deletePatientForm")
	public ModelAndView patientDeleted(Patient p) {
		ModelAndView md = new ModelAndView("header");
try {
		patientRepository.delete(p);
		md.addObject("msg", "Patient deletion initiated successfully");
		}catch(Error e) {
			md.addObject("msg","error");
			}
		return md;
	}
	
	@GetMapping("viewPatients")
	public ModelAndView getAllPatientsDetails() {
		ModelAndView md=new ModelAndView("viewPatients");
		ArrayList<Patient> plist=(ArrayList<Patient>) patientRepository.findAll();
		md.addObject("plist", plist);
		return md;
	}
	
	@GetMapping("patientDetailsForm")
	public ModelAndView getPatientDetails() {
		return new ModelAndView("patientDetails");
	}
	
	@PostMapping("patientDetailsForm")
	public ModelAndView PatientDetails(Patient p) {
		ModelAndView md= new ModelAndView("patientDetails");
		try {
			p=patientRepository.findById(p.getId()).get();
			md.addObject("p",p);
		}catch(Error e) {
				md.addObject("msg","error");
				}
			return md;
		}
	
	
	@PostMapping("deletePatientget")
	public ModelAndView deletePatientget(Patient p) {
		ModelAndView md= new ModelAndView("deletePatientForm");
		try {
			p=patientRepository.findById(p.getId()).get();
			md.addObject("p",p);
		}catch(Error e) {
				md.addObject("msg","error");
				}
			return md;
		}
	
	@PostMapping("updatePatientget")
	public ModelAndView updatePatientget(Patient p) {
		ModelAndView md= new ModelAndView("updatePatientForm");
		try {
			p=patientRepository.findById(p.getId()).get();
			md.addObject("p",p);
		}catch(Error e) {
				md.addObject("msg","error");
				}
			return md;
		}

	
	
}
