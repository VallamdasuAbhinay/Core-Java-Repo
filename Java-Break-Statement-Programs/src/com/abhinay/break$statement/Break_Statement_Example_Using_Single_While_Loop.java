package com.abhinay.break$statement;

public class Break_Statement_Example_Using_Single_While_Loop {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("End of while-loop");
	}

}

/*
 * The working of the break statement in the while loop is the same as in the
 * case of for loop.
 * 
 * Explanation:
 * 
 * The above example works exactly like a normal for loop. The loop starts
 * iterating from 1 to 9. When the value of i becomes 4, the if-condition
 * becomes true.
 * 
 * The break statement then terminates the loop and moves to control to the
 * print statement “End of loop”.
 */


