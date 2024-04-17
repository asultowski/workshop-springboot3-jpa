package com.sultowski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sultowski.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
