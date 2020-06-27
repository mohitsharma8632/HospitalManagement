package com.hospital.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hospital.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
