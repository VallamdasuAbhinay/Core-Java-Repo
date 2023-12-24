package com.abhinay.break$statement;

public class Break_Statement_Example_Using_Single_For_Loop {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("End of for-loop");
	}

}

/*
 * Explanation:
 * 
 * In the above example, we see that the for loop starts from 1 and keeps
 * iterating till it reaches 9. Inside the loop, we have a print statement that
 * prints i and we have an if-condition that contains the break statement. This
 * break statement will execute only when i value equals to 4.
 */
