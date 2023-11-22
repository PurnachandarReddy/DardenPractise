package com.example.SpringBootGithubLink;

public class StudentClass {
	private String name;
	private Integer age;
	private double salary;
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private Integer getAge() {
		return age;
	}
	private void setAge(Integer age) {
		this.age = age;
	}
	private double getSalary() {
		return salary;
	}
	private void setSalary(double salary) {
		this.salary = salary;
	}
	public StudentClass(String name, Integer age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	
}
