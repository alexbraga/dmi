package com.example.domainmodel.repositories;

import com.example.domainmodel.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
