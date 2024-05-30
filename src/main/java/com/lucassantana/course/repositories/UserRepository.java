package com.lucassantana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucassantana.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
