package com.hospital.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hospital.model.Medicine;

public interface MedicineRepository extends CrudRepository<Medicine, Integer> {

}
