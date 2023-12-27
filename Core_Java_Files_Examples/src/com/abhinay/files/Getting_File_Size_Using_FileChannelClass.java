package com.abhinay.files;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Getting_File_Size_Using_FileChannelClass {

	public static void main(String[] args) {
		Path pathObj = Paths.get("C:\\Users\\Admin\\Desktop\\induction.txt");
		try {
			FileChannel channel = FileChannel.open(pathObj);
			long file_bytes = channel.size();
			System.out.println("File Size :: " + file_bytes + " bytes");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

/*
 * The Java FileChannel class is a channel that is connected to a file by which
 * we can read data from a file and write data to a file or access file
 * metadata. It is found in java.nio package (NIO stands for non-blocking I/O)
 * which is a collection of Java programming language APIs that offer features
 * for intensive I/O operations.
 * 
 * File channels are safe for use by multiple concurrent threads, making Java
 * NIO more efficient than Java IO. However, only one operation that involves
 * updating a channel's position or changing its file size is allowed at a time.
 * If other threads are performing a similar operation, it will block them until
 * the previous operation is completed.
 * 
 * Also, we can't create objects of the FileChannel class directly, we need to
 * create them by invoking the open() method defined by this class. This method
 * opens or creates a file, returning a file channel to access the file. After
 * creating a FileChannel instance we can call the size() method which will
 * return the current size of this channel's file, measured in bytes.
 */