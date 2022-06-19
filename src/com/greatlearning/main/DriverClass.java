package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

/**
 * @author Shashi Kant Singh Pal
 * 
 *         Driver Class for email Application
 *
 */
public class DriverClass {

	CredentialService credentialService = new CredentialService();
	String generatedEmail;
	char[] generatedPassword;

	// starting point of email application
	public static void main(String[] args) {

		System.out.println("Welcome to IT Support Administration!!");

		Scanner sc = new Scanner(System.in);

		String firstName;
		String lastName;

		System.out.println("Please enter the First Name : ");
		firstName = sc.nextLine();
		System.out.println("Please enter the Second Name : ");
		lastName = sc.nextLine();

		Employee employee = new Employee(firstName, lastName);
		DriverClass driverClass = new DriverClass();

		if (!(employee.getFirstName().isEmpty() && employee.getLastName().isEmpty())) {
			int option;
			System.out.println("-----------------------------------------------------------");
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("-----------------------------------------------------------");
			option = sc.nextInt();
			switch (option) {
			case 1:
				driverClass.optionService(employee, "tech");
				break;
			case 2:
				driverClass.optionService(employee, "admin");
				break;
			case 3:
				driverClass.optionService(employee, "hr");
				break;
			case 4:
				driverClass.optionService(employee, "legal");
				break;
			default:
				System.out.println("enter valid option");

			}
		} else {
			System.out.println("Name cannot be empty!!!");
		}
		sc.close();
	}

	/**
	 * @param employee
	 * @param department
	 */
	public void optionService(Employee employee, String department) {
		generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
				department);
		generatedPassword = credentialService.generatePassword();
		credentialService.showCredentials(employee, generatedEmail, generatedPassword);

	}

}
