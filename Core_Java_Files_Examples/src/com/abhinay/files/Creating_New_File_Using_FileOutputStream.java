package com.abhinay.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Creating_New_File_Using_FileOutputStream {

	public static void main(String[] args) throws IOException {
		String fileName = "output-stream.txt";
		try {
			FileOutputStream outStream = new FileOutputStream(fileName, true);
			String sample_text = "This is Abhinay....";
			byte[] byteArray = sample_text.getBytes();
			outStream.write(byteArray);
			outStream.close();
			System.out.println("Date Written to file and saved.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
/*
 * A FileOutputStream is an output stream used for writing data to a File or
 * FileDescriptor. It is part of Java's java.io package and provides support for
 * file-related operations. The class offers different constructors to create
 * instances for writing to files. When creating a new instance, if the file
 * does not exist, a new file is created. However, if there are security
 * restrictions or insufficient permissions, a FileNotFoundException is thrown.
 * 
 * Here, we are creating a FileOutputStream class object using a file name and
 * the append mode set to true, which means the new data will be added to the
 * file after the end text. We have taken a sample text in the string, and after
 * converting it to raw bytes, written it to the file output stream, and closed
 * the stream at the end after all work is done. If the file does not exist,
 * then a new file is created. If the file is not able to open due to security
 * reasons, then FileNotFoundException is thrown which is handled using the
 * try-catch block.
 */