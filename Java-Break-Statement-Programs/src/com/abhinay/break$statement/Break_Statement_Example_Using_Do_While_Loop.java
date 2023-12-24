package com.abhinay.break$statement;

public class Break_Statement_Example_Using_Do_While_Loop {

	public static void main(String[] args) {
		int i = 1;
		do {
			if (i == 4) {
				break;
			}
			System.out.println(i);
			i++;
		} while (i > 0);
		System.out.println("End of the do-while-loop");
	}

}

/*
 * Explanation:
 * 
 * In the above example, we see that the do-while loop starts iterating from 1
 * and keeps on iterating because of the given condition -> (i > 0) . This
 * condition can never become false.
 * 
 * So this loop is called an Infinite loop since it goes on executing till
 * infinity and never stops. In such cases, the break statement helps us in
 * breaking or terminating the loop at some point.
 * 
 * Here we see that when i becomes 4, the if-condition becomes true and then the
 * break statement terminates the loop, taking the control directly to the print
 * statement “End of the do-while-loop”.
 */