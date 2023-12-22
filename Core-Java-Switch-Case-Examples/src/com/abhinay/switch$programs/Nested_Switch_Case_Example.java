package com.abhinay.switch$programs;

public class Nested_Switch_Case_Example {
	/*
	 * A nested switch statement refers to a scenario where a switch statement is
	 * used inside another switch statement. Basically, it is switch statement
	 * within a switch statement.
	 */
	public static void main(String[] args) {
		int year = 2023, semister = 1;
		switch (year) {
		case 2021:
			switch (semister) {
			case 1:
				System.out.println("You are currently studying in the year " + year + " in semister " + semister);
				break;
			case 2:
				System.out.println("You are currently studying in the year " + year + " in semister " + semister);
				break;
			}
			break;
		case 2022:
			switch (semister) {
			case 1:
				System.out.println("You are currently studying in the year " + year + " in semister " + semister);
				break;
			case 2:
				System.out.println("You are currently studying in the year " + year + " in semister " + semister);
				break;
			}
			break;
		case 2023:
			switch (semister) {
			case 1:
				System.out.println("You are currently studying in the year " + year + " in semister " + semister);
				break;
			case 2:
				System.out.println("You are currently studying in the year " + year + " in semister " + semister);
				break;
			}
			break;
			// Default case statement
		default:
			System.out.println("Invalid Year or Semister provided.");
			break;
		}
	}

}
