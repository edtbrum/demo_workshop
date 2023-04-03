package com.brm.demo_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brm.demo_curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
