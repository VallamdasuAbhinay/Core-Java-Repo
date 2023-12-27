package com.abhinay.files;

import java.io.File;

public class Getting_File_Size_Using_FileClass {
	/*
	 * The File class in java contains a length() method that returns the size of
	 * the file in bytes. To use this method, we first need to create an object of
	 * the File class by calling the File(String pathname) constructor. This
	 * constructor creates a new File instance by converting the given pathname
	 * string into an abstract pathname.
	 */	
	public static void main(String[] args) {
		File fileObj = new File("C:\\Users\\Admin\\Desktop\\induction.txt");
		//checking if the specified file exists or not
		if(fileObj.exists()) {
			long file_bytes = fileObj.length();
			System.out.println("File size in bytes : "+file_bytes);
			System.out.println("File size in KB : "+ (file_bytes/1024.0) + " KB");
		}
	}

}
