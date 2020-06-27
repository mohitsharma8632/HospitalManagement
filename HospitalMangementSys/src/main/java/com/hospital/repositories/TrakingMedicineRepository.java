package com.hospital.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hospital.model.TrackingMedicinesIssued;

public interface TrakingMedicineRepository extends CrudRepository<TrackingMedicinesIssued, Integer> {

}
