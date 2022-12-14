package com.demo.service;

import java.util.Arrays;
import java.util.List;

import com.demo.model.Employee;

@org.springframework.stereotype.Service
public class Service {
	
	public List<Employee> getAllEmployees() {
		Employee p1 = new Employee("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Employee p2 = new Employee("Angel", 158, 5000, "Female", 2, Arrays.asList("Driving", "Music", "Football"));
		Employee p3 = new Employee("Dean", 140, 5700, "Male", 2, Arrays.asList("Cricket", "Driving", "Tennis"));
		Employee p4 = new Employee("Nancy", 130, 4900, "Female", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Employee p5 = new Employee("Harper", 125, 9000, "Female", 2, Arrays.asList("Football", "Swimming", "Tennis"));
		Employee p6 = new Employee("Alan", 110, 9500, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Employee p7 = new Employee("Campell", 165, 1548, "Male", 1, Arrays.asList("Swimming", "Tennis"));

		return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
	}

}
