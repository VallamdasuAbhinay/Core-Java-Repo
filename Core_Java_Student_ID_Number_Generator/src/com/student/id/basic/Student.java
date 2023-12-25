package com.student.id.basic;

public class Student {

	public String firstName;
	public String lastName;
	public int standard;
	public String gender;
	public int yearOfBirth;

	// Parameterized Constructor of Student class
	public Student(String firstName, String lastName, int standard, String gender, int yearOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.standard = standard;
		this.gender = gender;
		this.yearOfBirth = yearOfBirth;
	}

	// Default Constructor of Student class
	public Student() {
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the standard
	 */
	public int getStandard() {
		return standard;
	}

	/**
	 * @param standard the standard to set
	 */
	public void setStandard(int standard) {
		this.standard = standard;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the yearOfBirth
	 */
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	/**
	 * @param yearOfBirth the yearOfBirth to set
	 */
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}// End of Student class