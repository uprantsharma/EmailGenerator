package com.emailgenerator.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getdepartment() {
		return lastName;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
		
	public Employee (String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=department;
	}
}
