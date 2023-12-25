package com.vallamdasu;

public class Student {

	public int studentID;
	public String studentName;
	public String departmentName;
	public int semesterNo;

	// Parameterized constructor for the Student class
	public Student(int studentID, String studentName, String departmentName, int semesterNo) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.semesterNo = semesterNo;
	}

	// Default constructor for the Student class
	public Student() {
	}

	// This method will display the details like student ID,name,department name and
	// semester number
	public void display() {
		System.out.println("Student ID : " + studentID);
		System.out.println("Name of the student : " + studentName);
		System.out.println("Department Name : " + departmentName);
		System.out.println("Semester Number : " + semesterNo);
	}

	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the semesterNo
	 */
	public int getSemesterNo() {
		return semesterNo;
	}

	/**
	 * @param semesterNo the semesterNo to set
	 */
	public void setSemesterNo(int semesterNo) {
		this.semesterNo = semesterNo;
	}

}// End of Student class