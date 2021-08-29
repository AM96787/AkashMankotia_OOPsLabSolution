package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String lastName;
	private int department;

	public Employee(String firstName, String lastName, int department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	/* Getter Method for Employee First Name */
	public String getFirstName() {
		return firstName;
	}

	/* Getter Method for Employee Last Name */
	public String getLastName() {
		return lastName;
	}

	/* Getter Method for Employee Department */
	public String getDepartment() {
		String dept = null;
		switch (department) {
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "adm";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept = "lg";
			break;
		default:
			System.out.println("Invalid Input");
			System.exit(-1);
			break;
		}
		return dept;
	}
}
