package com.abhinay.files;

/*
 * File class in Java is used whenever a user wants to store new data, read
 * and/or modify old data, append new data, create new folders, etc on to some
 * storage device. It is a concrete class which provides methods for creating,
 * reading, modifying, and deleting files and folders.
 * 
 * "There are mainly three ways of creating a file through code in Java using
 * JDK libraries:
 * 
 * Using the createFile() method of the Files class present in the java.nio
 * package.
 * 
 * Using the createNewFile() method of the File class present in the java.io
 * package.
 * 
 * Using the FileOutputStream(String fileName, boolean append) constructor of
 * the FileOutputStream class present in the java.io package. where, io stands
 * for input-output and, nio stands for non-blocking input-output.
 * 
 * File(s) can also be created in Java using some external libraries like Google
 * Guava, and Apache Commons IO library.
 * 
 * There are 3 methods to create a file in Java: Using Files.createFile()
 * method, Using File.createNewFile() method, and, Using FileOutputStream class
 * Constructor Files class belong to java.nio package, whereas File and
 * FileOutputStream classes belong to java's io package 
 * 
 * java's nio package is buffer-oriented and java's io package is stream-oriented. 
 * 
 * FileOutputStream is
 * an output stream for writing data to a File or to a FileDescriptor.
 * 
 * File.createNewFile() is stream-oriented and creates a new and empty file
 * automatically if it does not yet exist. 
 * 
 * Files.createFile() is buffer-oriented
 * and thus gives more flexibility to move back and forth in the data as the
 * data is cached in the buffer first and processed afterward, as compared to
 * stream-oriented methods.
 */