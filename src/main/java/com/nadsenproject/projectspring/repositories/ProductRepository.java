package com.nadsenproject.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nadsenproject.projectspring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}