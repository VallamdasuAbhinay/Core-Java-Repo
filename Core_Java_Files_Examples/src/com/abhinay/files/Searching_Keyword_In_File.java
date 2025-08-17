package com.abhinay.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Searching_Keyword_In_File {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\sample-or.txt";
		String keyword = "add";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			String line;
			Integer lineNumber = 1;
			Boolean isKeywordFound = false;
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(keyword)) {
					System.out.println("The Keyword " + keyword + " found at the line# " + lineNumber + "--> " + line);
					isKeywordFound = true;
				}
				lineNumber++;
			}
			if (!isKeywordFound) {
				System.out.println("The Keyword " + keyword + " not found in file.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

/* Explanation
 * 
 * This program is used to find the specified keyword the file available at given path.
 * 
 * If the keyword is found, it prints the line as well as the line-number, at which the keyword is found.
 * 
 * If the keyword is not found anywhere in the file, it prints as no matches found in the file.
 * 
 * 
 * */
	