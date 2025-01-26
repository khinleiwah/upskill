package com.upskill.category.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upskill.category.model.Category;
import com.upskill.category.repository.CategoryRepository;

@RestController
@CrossOrigin
public class CategoryController {
	@Autowired
	private Environment environment;
	
	@Autowired
	private CategoryRepository repo;
	
	@GetMapping("/categories")
	public List<Category> getCategories() {
	
		String port = environment.getProperty("local.server.port");
		System.out.println("env port "+ port);
		
		
		return repo.findAll();
	}

	
	@GetMapping("/category/{id}")
	public String getCategoryById(@PathVariable int id) {
	
		String port = environment.getProperty("local.server.port");
		System.out.println("env port "+ port);
		
		
		return repo.findById(id).get().getName();
	}
}
