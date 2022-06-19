package com.greatlearning.model;

/**
 * @author Shashi Kant Singh Pal
 * 
 *         Employee class to initialize first and last Name
 *
 */
public class Employee {

	private String firstName;
	private String lastName;

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

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

}
