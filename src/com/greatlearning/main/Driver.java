package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee's First Name");
		String fn = sc.next();
		System.out.println("Enter Employee's Last Name");
		String ln = sc.next();
		System.out.println("Please enter the department from following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int dept = sc.nextInt();
		Employee emp = new Employee(fn, ln, dept);
		//System.out.println("Employee First Name: " + emp.getFirstName());
		//System.out.println("Employee Last Name: " + emp.getLastName());
		sc.close();
		CredentialsService cs = new CredentialsService();
		cs.generateEmail(emp);
		cs.generatePassword();
		System.out.println("Dear " + emp.getFirstName() + " please find your credentials below");
		cs.showCredentials();
	}

}
