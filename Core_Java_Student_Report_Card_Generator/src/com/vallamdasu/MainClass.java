package com.vallamdasu;

import java.util.*;

public class MainClass {
	// This method will validate the input details like student ID, semester
	// number,total subjects and points earned
	// and it will return true if all inputs are fine else it returns false.
	public static boolean validateInputs(int studentID, int semNumber, int total_subjects, int points_earned) {

		boolean validateInputsStatus = true;
		boolean studentIDStatus = true;
		boolean semNumberStatus = true;
		boolean totalSubjectsStatus = true;
		boolean pointsEarnedStatus = true;
		int studentIDLength = String.valueOf(studentID).length();
		if (studentIDLength != 4) {
			studentIDStatus = false;
		}
		if (semNumber < 1 || semNumber > 7) {
			semNumberStatus = false;
		}
		if (total_subjects < 1 || total_subjects > 7) {
			totalSubjectsStatus = false;
		}
		if (points_earned < 1 || points_earned > 20) {
			pointsEarnedStatus = false;
		}

		if (studentIDStatus == false || semNumberStatus == false || totalSubjectsStatus == false
				|| pointsEarnedStatus == false) {
			validateInputsStatus = false;
		}

		else {
			validateInputsStatus = true;
		}
		return validateInputsStatus;
	}// End of validateInputs method

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The Student ID:");
		int student_id = scanner.nextInt();
		System.out.println("Please Enter The Student Name:");
		String student_name = scanner.next();
		System.out.println("Please Enter The Department Name:");
		String department_name = scanner.next();
		System.out.println("Please Enter The Semester Number:");
		int semester_number = scanner.nextInt();
		System.out.println("Please Enter The Total Subjects:");
		int total_subjects = scanner.nextInt();
		System.out.println("Please Enter The Points Earned:");
		int points_earned = scanner.nextInt();
		scanner.close();
		boolean result = false;
		result = validateInputs(student_id, semester_number, total_subjects, points_earned);

		if (result == true) {

			StudentReportCard studentReportCardObj = new StudentReportCard(student_id, student_name, department_name,
					semester_number, total_subjects, points_earned);
			studentReportCardObj.display();
		}
		if (result == false) {
			System.out.println("Invalid Request");
		}

	}// End of main method

}// End of MainClass