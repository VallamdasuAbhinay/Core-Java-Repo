package com.student.id.main;

import com.student.id.basic.*;
import com.student.id.service.*;
import java.util.*;

public class StudentMainClass {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Student First Name ::");
		String studentFirstName = scanner.next();
		System.out.println("Enter The Student Last Name ::");
		String studentLastName = scanner.next();
		System.out.println("Enter The Student Standard ::");
		int studentStandard = scanner.nextInt();
		System.out.println("Enter The Student Gender ::");
		String studentGender = scanner.next();
		System.out.println("Enter The Student Year Of Birth ::");
		int studentYearOfBirth = scanner.nextInt();
		scanner.close();
		Student studentObj = new Student();
		studentObj.setFirstName(studentFirstName);
		studentObj.setLastName(studentLastName);
		studentObj.setStandard(studentStandard);
		studentObj.setGender(studentGender);
		studentObj.setYearOfBirth(studentYearOfBirth);

		String studentIDGenerated = StudentIDGenerator.generateStudentID(studentObj);
		System.out.println(studentIDGenerated.toUpperCase());// student ID should always be in uppercase and hence
																// converting it toUpperCase()

	}// End of Main method

}// End of StudentMainClass class