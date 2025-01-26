package com.upskill.category.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upskill.category.model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
}
