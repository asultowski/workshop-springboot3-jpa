package com.sultowski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sultowski.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
