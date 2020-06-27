package com.hospital.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hospital.model.Diagnostics;

public interface DiagnosticsRepository extends CrudRepository<Diagnostics, Integer> {

}
