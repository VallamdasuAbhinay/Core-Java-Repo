package com.vallamdasu;

public class StudentReportCard extends Student {

	public int total_subjects;
	public int points_earned;
	public float gpa = 0.0f;
	public float cgpa = 0.0f;

	// Parameterized constructor for the StudentReportCard class
	public StudentReportCard(int studentID, String studentName, String departmentName, int semesterNo,
			int total_subjects, int points_earned) {

		this.studentID = studentID;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.semesterNo = semesterNo;
		this.total_subjects = total_subjects;
		this.points_earned = points_earned;
	}

	// This method will calculate the student GPA based on the total subjects and
	// points earned
	public float gpaCalculator() {
		gpa = ((total_subjects) * (points_earned)) / (7.0f);
		this.setGpa(gpa);
		return gpa;
	}

	// This method will calculate the student CGPA based on the GPA and Semester
	// Number
	public float cgpaCalculator(float gpa) {
		cgpa = ((gpa) / (semesterNo));
		this.setCgpa(cgpa);
		return cgpa;
	}

	// This method will display the details like student ID,name,department
	// name,semester number, GPA and CGPA.
	public void display() {
		System.out.println("Student ID : " + studentID);
		System.out.println("Name of the student : " + studentName);
		System.out.println("Department Name : " + departmentName);
		System.out.println("Semester Number : " + semesterNo);
		gpaCalculator();
		System.out.println("GPA Computed : " + gpa);
		cgpaCalculator(gpa);
		System.out.println("CGPA Computed : " + cgpa);
	}

	/**
	 * @return the total_subjects
	 */
	public int getTotal_subjects() {
		return total_subjects;
	}

	/**
	 * @param total_subjects the total_subjects to set
	 */
	public void setTotal_subjects(int total_subjects) {
		this.total_subjects = total_subjects;
	}

	/**
	 * @return the points_earned
	 */
	public int getPoints_earned() {
		return points_earned;
	}

	/**
	 * @param points_earned the points_earned to set
	 */
	public void setPoints_earned(int points_earned) {
		this.points_earned = points_earned;
	}

	/**
	 * @return the gpa
	 */
	public float getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	/**
	 * @return the cgpa
	 */
	public float getCgpa() {
		return cgpa;
	}

	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

}// End of StudentReportCard class