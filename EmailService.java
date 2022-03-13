package com.emailgenerator.service;

import java.util.Random;

import com.emailgenerator.model.Employee;

public class EmailService {

//Define the included characters to generate the password
	public char[] genPswd() {
		String capitalLatters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLatters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String spacialCharacters = "!@#$%^&*_+-/|?";
		String values = capitalLatters + smallLatters +  spacialCharacters+numbers;
		// using random function to mix random value during password generating
		Random random = new Random();
//define the character length for password
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

//Define the logic to generate the emailid
	public String generateEmailId(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".sindhujamicrocredit.com";
	}
//defining the Print statement output
	public void credential(Employee employee, String email, char[] genPswd) {
		System.out.println("Dear" + employee.getFirstName() + " " + employee.getLastName() + "Your new Email ID is");
		System.out.println("Email ===>" + email);
		System.out.println("Default Password is " + genPswd);
	}
}
