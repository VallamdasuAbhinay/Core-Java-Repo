package com.abhinay.files;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Creating_New_File_Using_createFile_Method {

	public static void main(String[] args) {
//		providing the file path which is not in the current working directory
		Path pathObj = Paths.get("C:\\Users\\Admin\\Desktop\\induction.txt");
//		since we have provided just file name here, compiler will check for this file
//		existence in the current working directory
//		Path pathObj = Paths.get("abhinay-sample-file.txt");
		try {
			Files.createFile(pathObj);
			System.out.println("File successfully created at the path " + pathObj);
		} catch (FileAlreadyExistsException e) {
			System.out.println("File already exists at Path: " + pathObj);
		} catch (Exception e) {
			System.out.println("Exception occurring while creating the file: " + e.getMessage());
		}
//		The Files.createFile() method is used to create a new file.
//		It is a method of the Files class, which belongs to the java.nio.file package.
//		This method creates a new file if a file with the same name does not already exist.
//		However, if the file already exists, an exception named FileAlreadyExistsException is thrown.
//		Files class belongs to java.nio package.

		/*
		 * As we already discussed that Files.createFile() method requires a Path class
		 * object as an argument, so we have created a path object of Path class, for
		 * the file path given as "abhinay-sample-file.txt". As we have not used
		 * anything before abhinay-sample-file.txt, this means that the compiler will
		 * look for the file in the current working directory itself, where the current
		 * program is saved.
		 */
		/*
		 * The file gets created when there does not exist a file previously, but if the
		 * file already exists in the directory, then a FileAlreadyExistsException will
		 * be thrown, which is handled by a print statement, to notify the user.
		 */
	}

}
