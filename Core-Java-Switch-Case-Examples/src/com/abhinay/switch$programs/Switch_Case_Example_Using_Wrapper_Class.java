package com.abhinay.switch$programs;

public class Switch_Case_Example_Using_Wrapper_Class {
	/*
	 * The wrapper class in Java allows us to convert primitive data types into
	 * objects. We can use Byte, Integer, Short and Long variables with wrapper
	 * classes in switch statements in Java.
	 */ 
	public static void main(String[] args) {
		Integer age = 18;
		switch (age) {
		case (16):
			System.out.println("Ineligible to vote!");
			break;
		case (18):
			System.out.println("Eligible to vote");
			break;
		case (65):
			System.out.println("Senior Citizen");
			break;
		default:
			System.out.println("Please give a valid age.");
		}
	}
}
