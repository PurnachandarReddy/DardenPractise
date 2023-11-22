package model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity

public class Student {	

	private String same; 
	private int sge; 
	private Long salary;
	
	public Student() {
		
	}
	private String getSame() {
		return same;
	}
	private void setSame(String same) {
		this.same = same;
	}
	private int getSge() {
		return sge;
	}
	private void setSge(int sge) {
		this.sge = sge;
	}
	private Long getSalary() {
		return salary;
	}
	private void setSalary(Long salary) {
		this.salary = salary;
	}
	public Student(String same, int sge, Long salary) {
		super();
		this.same = same;
		this.sge = sge;
		this.salary = salary;
	}
	
	

	
}
