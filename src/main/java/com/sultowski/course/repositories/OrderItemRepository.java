package com.sultowski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sultowski.course.entities.OrderItem;
import com.sultowski.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
