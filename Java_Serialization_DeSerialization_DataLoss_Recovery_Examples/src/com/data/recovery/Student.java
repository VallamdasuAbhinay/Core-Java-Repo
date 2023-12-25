package com.data.recovery;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8641953648973585707L;

	private String studentID;

	private String studentName;

	private String studentLocation;

	private String studentGrade;

	private transient String studentBackground;

	private transient int studentMarks;

	/**
	 * @return the studentID
	 */
	public String getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(String studentID) {
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
	 * @return the studentLocation
	 */
	public String getStudentLocation() {
		return studentLocation;
	}

	/**
	 * @param studentLocation the studentLocation to set
	 */
	public void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}

	/**
	 * @return the studentGrade
	 */
	public String getStudentGrade() {
		return studentGrade;
	}

	/**
	 * @param studentGrade the studentGrade to set
	 */
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	/**
	 * @return the studentBackground
	 */
	public String getStudentBackground() {
		return studentBackground;
	}

	/**
	 * @param studentBackground the studentBackground to set
	 */
	public void setStudentBackground(String studentBackground) {
		this.studentBackground = studentBackground;
	}

	/**
	 * @return the studentMarks
	 */
	public int getStudentMarks() {
		return studentMarks;
	}

	/**
	 * @param studentMarks the studentMarks to set
	 */
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentLocation="
				+ studentLocation + ", studentGrade=" + studentGrade + ", studentBackground=" + studentBackground
				+ ", studentMarks=" + studentMarks + "]";
	}

	/*
	 * This method will be automatically invoked by the JVM, during object
	 * Serialization If we want to perform any activities, like to store transient
	 * variables data, we can do it here
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		System.out.println("Inside writeObject");
		oos.defaultWriteObject();
		String stBackground = "recover" + studentBackground;
		int stMarks = studentMarks + 444;
		oos.writeUTF(stBackground);
		oos.writeInt(stMarks);
	}

	/*
	 * This method will be automatically invoked by the JVM, during object
	 * De-Serialization
	 */
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		System.out.println("Inside readObject");
		ois.defaultReadObject();
		String stBackground = (String) ois.readUTF();
		int stMarks = (int) ois.readInt();
		studentBackground = stBackground.substring(7);
		studentMarks = stMarks - 444;

	}

}
