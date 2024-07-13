package com.primeriobackend.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeriobackend.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
