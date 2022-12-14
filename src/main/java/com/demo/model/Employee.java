package com.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

public class Employee {
	private String name;
	private int height;
	private double salary;
	private String gender;
	private int kids;
	List<String> hobbies = new ArrayList<>();
	Optional<Address> address;

	public Employee(String name, int height, double salary, String gender, int kids, List<String> hobbies) {
		super();
		this.name = name;
		this.height = height;
		this.salary = salary;
		this.gender = gender;
		this.kids = kids;
		this.hobbies = hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getKids() {
		return kids;
	}

	public void setKids(int kids) {
		this.kids = kids;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}

}
