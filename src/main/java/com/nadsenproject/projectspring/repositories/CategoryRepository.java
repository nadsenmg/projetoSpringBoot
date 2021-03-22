package com.nadsenproject.projectspring.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nadsenproject.projectspring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>  {
	
	
}