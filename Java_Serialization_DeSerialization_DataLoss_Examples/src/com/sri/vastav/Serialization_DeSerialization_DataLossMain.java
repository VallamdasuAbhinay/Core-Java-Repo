package com.sri.vastav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_DeSerialization_DataLossMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Employee empObj = new Employee();
		empObj.setEmpID("AB72468");
		empObj.setEmpName("Vallamdasu");
		empObj.setEmpLocation("Hyderabad");
		empObj.setEmpDesignation("Tech Lead");
		empObj.setEmpSalary(96244);
		System.out.println("Printing Employee Object details before Serialization.....");
		System.out.println(empObj);

		ObjectOutputStream objOutStream = new ObjectOutputStream(
				new FileOutputStream(new File("Ser_DeSer_DataLoss.txt")));
		objOutStream.writeObject(empObj);
		objOutStream.close();

		ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream(new File("Ser_DeSer_DataLoss.txt")));
		Employee empDeSerObj = (Employee) objInStream.readObject();
		objInStream.close();

		System.out.println("\nPrinting details from DeSerialized Employee Object.......");
		System.out.println(empDeSerObj.getEmpID());
		System.out.println(empDeSerObj.getEmpName());
		System.out.println(empDeSerObj.getEmpLocation());
		System.out.println(empDeSerObj.getEmpDesignation());
		System.out.println(empDeSerObj.getEmpSalary());

	}

}
