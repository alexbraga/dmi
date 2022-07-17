package com.example.domainmodel.repositories;

import com.example.domainmodel.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
