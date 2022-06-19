package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

/**
 * @author Shashi Kant Singh Pal
 * 
 *         Service to generate and show credentials
 *
 */
public class CredentialService {

	/**
	 * @return password
	 */
	public char[] generatePassword() {

		char[] password = new char[8];

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()<>?";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();

		password[0] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		password[1] = smallLetters.charAt(random.nextInt(smallLetters.length()));
		password[2] = numbers.charAt(random.nextInt(numbers.length()));
		password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

		for (int i = 4; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}

		return password;

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param department
	 * @return emailAddress
	 */
	public String generateEmailAddress(String firstName, String lastName, String department) {
		StringBuffer emailAddress = new StringBuffer();
		emailAddress.append(firstName.replaceAll("\\s", ""));
		emailAddress.append(lastName.replaceAll("\\s", ""));
		emailAddress.append("@");
		emailAddress.append(department);
		emailAddress.append(".abc.com");

		return emailAddress.toString();

	}

	/**
	 * @param employee
	 * @param emailAddress
	 * @param password
	 */
	public void showCredentials(Employee employee, String emailAddress, char[] password) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    ---> " + emailAddress);
		System.out.print("Password ---> ");
		System.out.println(password);

	}

}
