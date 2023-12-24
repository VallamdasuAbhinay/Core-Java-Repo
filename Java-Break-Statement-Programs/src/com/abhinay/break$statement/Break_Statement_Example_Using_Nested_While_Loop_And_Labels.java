package com.abhinay.break$statement;

public class Break_Statement_Example_Using_Nested_While_Loop_And_Labels {

	public static void main(String[] args) {
		int i = 1;
		outer: while (i < 4) {
			int j = 1;
			while (j < 6) {
				// when value of j becomes 4, loop with label outer terminates
				if (j == 4) {
					break outer;
				}
				System.out.print(j + " ");
				j++;
			}
			i++;
		}
		System.out.println("\nEnd of outer while-loop"); // control comes here directly after encountering the break statement
	}

}
/*
 * Explanation:
 * 
 * The outer loop starts iterating from 1 till it reaches 3, and for every i,
 * the inner loop iterates from 1 to 6.
 * 
 * Inside the inner loop, we have a print statement for j and we also have an
 * if-condition having a break statement, that holds only when i, becomes equal
 * to 4.
 * 
 * It looks for the ‘outer’ label in the program and takes the control out of
 * the code structure labeled as ‘outer’. It moves directly to the print
 * statement: “End of loop”.
 */