package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.Service;

@RestController
public class Controller {
	
	@Autowired
	private Service service;

	@GetMapping("/all")
	public List<Employee> getEmployees(){
		return service.getAllEmployees();
	}
}
