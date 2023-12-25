package com.data.recovery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_DeSerialization_DataLossRecoveryMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Student studentObj = new Student();
		studentObj.setStudentID("26AB89UTR");
		studentObj.setStudentName("Vastav");
		studentObj.setStudentLocation("Bangalore");
		studentObj.setStudentGrade("A Grade");
		studentObj.setStudentMarks(865);
		studentObj.setStudentBackground("Qualified Status");
		System.out.println("Printing Student Object details before Serialization.....");
		System.out.println(studentObj);

		ObjectOutputStream objOutStream = new ObjectOutputStream(
				new FileOutputStream(new File("StudentDataLossRecovery.txt")));
		objOutStream.writeObject(studentObj);
		objOutStream.close();

		ObjectInputStream objInStream = new ObjectInputStream(
				new FileInputStream(new File("StudentDataLossRecovery.txt")));
		Student studentDeSerObj = (Student) objInStream.readObject();
		objInStream.close();

		System.out.println("\nPrinting details from DeSerialized Student Object.......");
		System.out.println(studentDeSerObj.getStudentID());
		System.out.println(studentDeSerObj.getStudentName());
		System.out.println(studentDeSerObj.getStudentLocation());
		System.out.println(studentDeSerObj.getStudentGrade());
		System.out.println(studentDeSerObj.getStudentBackground());
		System.out.println(studentDeSerObj.getStudentMarks());
	}

}
