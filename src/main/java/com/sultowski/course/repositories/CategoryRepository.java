package com.sultowski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sultowski.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
