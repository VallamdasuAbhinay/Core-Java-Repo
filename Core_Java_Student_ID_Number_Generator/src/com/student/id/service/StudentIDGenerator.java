package com.student.id.service;

import com.student.id.basic.*;

import java.time.Year;
import java.util.*;

public class StudentIDGenerator {

	public static boolean validateStudentDetails(Student studentObject) {
		boolean validateStudentDetailsStatus = false;
		boolean standardStatus = true;
		boolean genderStatus = true;
		boolean yearOfBirthStatus = true;

		int stu_standard = studentObject.getStandard();
		String stu_gender = studentObject.getGender();
		int stu_year_of_birth = studentObject.getYearOfBirth();
		// Student standard must be in the range of [1-10] (inclusive)
		if (stu_standard < 1 || stu_standard > 10) {
			standardStatus = false;
		}
		// Student gender must be either MALE or FEMALE, perform case-in sensitive
		// comparison
		if (stu_gender != null) {
			if (stu_gender.equalsIgnoreCase("male") || stu_gender.equalsIgnoreCase("female")) {
				genderStatus = true;
			} else {
				genderStatus = false;
			}
		}
		// Student Year Of Birth must be less than atleast 3 years from current year
		int currentYear = Year.now().getValue();
		// System.out.println(currentYear);
		// System.out.println(stu_year_of_birth);
		if (currentYear - stu_year_of_birth < 3) {
			yearOfBirthStatus = false;
		}

		if (standardStatus == false || genderStatus == false || yearOfBirthStatus == false) {
			validateStudentDetailsStatus = false;
		} else {
			validateStudentDetailsStatus = true;
		}

		return validateStudentDetailsStatus;
	}

	public static String generateStudentID(Student student) {
		String studentID = "";
		boolean studentValidationFlag = validateStudentDetails(student);
		if (studentValidationFlag == true) {
			System.out.println("success");
			Random random = new Random();
			int randNum = random.nextInt(9999) + 0001;// Generating 4 digit random number
			System.out.println("randNum=" + randNum);
			// student ID will be combination of first 2 chars of firstname, first char of
			// lastname,first char of gender,
			// last 2 digits of year of birth, second and last digit of generated random
			// number
			studentID = studentID + student.getFirstName().substring(0, 2) + student.getLastName().charAt(0)
					+ student.getGender().charAt(0) + String.valueOf(student.getYearOfBirth()).substring(2, 4)
					+ String.valueOf(randNum).charAt(1) + String.valueOf(randNum).charAt(3);

		} else {
			System.out.println("failure");
		}
		return studentID;

	}
}// End of StudentIDGenerator class