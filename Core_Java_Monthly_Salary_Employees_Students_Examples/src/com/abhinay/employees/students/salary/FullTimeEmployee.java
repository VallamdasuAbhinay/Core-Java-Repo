package com.abhinay.employees.students.salary;

public class FullTimeEmployee extends Employee {

	private double basicSalary;

	private double bonus;

	private double tax;

	private double healthInsurance;
	
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public FullTimeEmployee() {
	}

	public FullTimeEmployee(double basicSalary, double bonus, double tax, double healthInsuranceInsurance, String number) {
		super();
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		this.tax = tax;
		this.healthInsurance = healthInsuranceInsurance;
		this.number = number;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [basicSalary=" + basicSalary + ", bonus=" + bonus + ", tax=" + tax
				+ ", healthInsuranceInsurance=" + healthInsurance + "]";
	}

	@Override
	public double getCompensation() {
		return (basicSalary + bonus - (tax + healthInsurance));
	}

}
