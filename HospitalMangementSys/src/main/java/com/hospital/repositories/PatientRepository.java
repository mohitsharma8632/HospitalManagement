package com.hospital.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hospital.model.Patient;
public interface PatientRepository extends CrudRepository<Patient,Integer> {

}
