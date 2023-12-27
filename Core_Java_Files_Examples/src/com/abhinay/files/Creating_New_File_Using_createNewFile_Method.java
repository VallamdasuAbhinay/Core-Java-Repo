package com.abhinay.files;

import java.io.File;
import java.io.IOException;

public class Creating_New_File_Using_createNewFile_Method {

	public static void main(String[] args) {
		File fileObj = new File("C:\\Users\\Admin\\Desktop\\induction.txt");
//		File fileObj = new File("test-abhinay.txt");
		try {
			Boolean fileCreationStatus = fileObj.createNewFile();
			if (fileCreationStatus) {
				System.out.println("File created successfully at the path...." + fileObj.getAbsolutePath());
			} else {
				System.out.println("File already exists at the path...." + fileObj.getAbsolutePath());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
 * The createNewFile() method belongs to the File class in Java's java.io
 * package. It is used to create a new, empty file. The method does not accept
 * any arguments. If the file does not already exist, it will be automatically
 * created.
 * 
 * This method Atomically creates a new and empty file if and only if a file with the same
 * name does not yet exist. The check for the existence of the file and the
 * creation of the file if it does not exist are a single operation that is
 * atomic with respect to all other filesystem activities that might affect the
 * file.
 * 
 * It returns true - if the file does not exist and was successfully created; 
 * 
 * It returns false - if the file already exists;
 */
