package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.security.SecureRandom;

public class CredentialsService {
	private String email;
	private String password;

	public void generateEmail(Employee emp) {
		StringBuilder sb = new StringBuilder();
		sb.append(emp.getFirstName()).append(emp.getLastName()).append("@").append(emp.getDepartment())
				.append(".abc.com");
		email = sb.toString();
	}

	public void generatePassword() {

		String allChars = "!@#$%^&*_=+-/.?<>)abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String specialChars = "!@#$%^&*_=+-/.?<>)";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		int ri1 = random.nextInt(specialChars.length());
		int ri2 = random.nextInt(smallChars.length());
		int ri3 = random.nextInt(upperChars.length());
		int ri4 = random.nextInt(numbers.length());
		sb.append(upperChars.charAt(ri1)).append(smallChars.charAt(ri2)).append(specialChars.charAt(ri3))
				.append(numbers.charAt(ri4));

		for (int i = 0; i < 4; i++) {
			int ri5 = random.nextInt(allChars.length());
			sb.append(allChars.charAt(ri5));
		}

		password = sb.toString();

	}

	public void showCredentials() {
		System.out.println("Employee Email: " + email.toLowerCase());
		System.out.println("Password: " + password);
	}
}
