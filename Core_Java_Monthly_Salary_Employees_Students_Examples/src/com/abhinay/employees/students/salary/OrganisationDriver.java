package com.abhinay.employees.students.salary;

import java.util.Objects;

public class OrganisationDriver {

	public static void main(String[] args) {
		Payee payeeOne = new Student("ABCD445566", "Shiva Shankar", "JNTU Hyderabad");
		double payeeOneSalary = printMonthlySalary(payeeOne);
		System.out.println("Payee One Details: " + payeeOne);
		System.out.println("Monthly Salary of Payee One is: " + payeeOneSalary);
		System.out.println("-------------------");
		Payee payeeTwo = new Employee("Shivanadh", "SVNDH8866PT");
		double payeeTwoSalary = printMonthlySalary(payeeTwo);
		System.out.println("Payee Two Details: " + payeeTwo);
		System.out.println("Monthly Salary of Payee Two is: " + payeeTwoSalary);
		System.out.println("-------------------");
		FullTimeEmployee payeeThree = new FullTimeEmployee(14000, 2600, 864, 600, "SVNDH8866FT");
		double payeeThreeSalary = fullTimeEmpSalary(payeeThree);
		System.out.println("Payee Three Details: " + payeeThree);
		System.out.println("Monthly Salary of Payee Three is: " + payeeThreeSalary);
	}

	public static double printMonthlySalary(Payee payeeInstance) {
		System.out.println(payeeInstance);
		if (payeeInstance instanceof Student) {
			System.out.println("Student Instance....");
			return 0;
		}
		if ((payeeInstance instanceof Employee) && (Objects.nonNull(payeeInstance.payeeNumber()))) {
			System.out.println("Employee Instance....");
			String payeeNumber = payeeInstance.payeeNumber();
			int payeeNumberLength = payeeNumber.length();
			if (payeeNumber.charAt(payeeNumberLength - 2) == 'P') {
				System.out.println("Part Time Employee..");
			}
			return 0;
		} 
		return 0;
	}
	
	public static double fullTimeEmpSalary(FullTimeEmployee empObj) {
		System.out.println("FullTimeEmployee Instance....");
		String payeeNumber = empObj.getNumber();
		int payeeNumberLength = payeeNumber.length();
		if (payeeNumber.charAt(payeeNumberLength - 2) == 'F') {
			System.out.println("Full Time Employee..");
		}
		return (empObj.getCompensation());
	}

}
