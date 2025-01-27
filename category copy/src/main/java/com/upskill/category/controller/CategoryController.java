package com.upskill.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upskill.category.model.Category;
import com.upskill.category.repository.CategoryRepository;

@RestController
@RequestMapping("api")
public class CategoryController {
	@Autowired
	private Environment environment;
	
	@Autowired
	private CategoryRepository repo;
	
	@GetMapping("/category/get_category")
	public List<Category> retrieveExchangeValue() {
	
		String port = environment.getProperty("local.server.port");
		System.out.println("env port "+ port);
		
		
		return repo.findAll();
	}

}
