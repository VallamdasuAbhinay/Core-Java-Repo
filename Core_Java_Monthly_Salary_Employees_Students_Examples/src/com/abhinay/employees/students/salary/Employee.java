package com.abhinay.employees.students.salary;

public class Employee implements Payee {

	public String name;

	public String number;

	public Employee() {

	}

	public Employee(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee number: " + number + ", name: " + name;
	}

	@Override
	public String payeeNumber() {
		return number;
	}

	@Override
	public double getCompensation() {
		// TODO Auto-generated method stub
		return 0;
	}

}
