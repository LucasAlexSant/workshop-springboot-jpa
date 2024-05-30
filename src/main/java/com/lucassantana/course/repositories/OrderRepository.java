package com.lucassantana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucassantana.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
