package com.sultowski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sultowski.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
