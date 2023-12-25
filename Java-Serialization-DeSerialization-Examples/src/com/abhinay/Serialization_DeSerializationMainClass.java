package com.abhinay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* Serialization is the process of converting an Object into Stream of Bytes and 
 * passing it over the underlying OutputStream.
 * 
 * Serialization -- is used to store the Objects State permanently in a persistent media
 * 
 * De-Serialization is the process of converting the Stream of Bytes into Original Object
*/

public class Serialization_DeSerializationMainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		BankAccount bankAccountObj = new BankAccount();
		// Below statement will call toString() method by default, if we try to print
		// object directly
		System.out.println(bankAccountObj);

		bankAccountObj.setAccountType("Current Account");
		bankAccountObj.setAccountHolderName("AbhinaySriVastav");
		bankAccountObj.setAccountNumber(2003004552288L);
		bankAccountObj.setAccountBalance(85499.99);
		System.out.println(bankAccountObj);

		ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(new File("abhinay.txt")));
		/*
		 * This will Serialize the specified object. To Serialize any object, primary
		 * condition is, the Class (to which this particular Object belongs to), should
		 * implement the Serializable Interface (This interface does not contain any
		 * methods, so it is called Marker Interface) This interface is available under
		 * java.io package
		 */

		objOutputStream.writeObject(bankAccountObj);
		objOutputStream.close();

		ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("abhinay.txt"));
		// This will De-Serialize the object and assigning it to original object
		BankAccount bankAccountDeSerializedObj = (BankAccount) objInputStream.readObject();
		objInputStream.close();
		System.out.println("Printing Object Details after De-Serialization............");
		System.out.println(bankAccountDeSerializedObj.getAccountType());
		System.out.println(bankAccountDeSerializedObj.getAccountHolderName());
		System.out.println(bankAccountDeSerializedObj.getAccountNumber());
		System.out.println(bankAccountDeSerializedObj.getAccountBalance());

	}

}
