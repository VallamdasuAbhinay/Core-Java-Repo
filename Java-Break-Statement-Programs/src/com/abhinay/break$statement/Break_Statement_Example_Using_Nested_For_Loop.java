package com.abhinay.break$statement;

public class Break_Statement_Example_Using_Nested_For_Loop {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {// outer for-loop
			for (int j = 1; j < 7; j++) {// inner for-loop
				// when value of j becomes 4, this inner for-loop gets terminated
				if (j == 4) {
					break;
				}
				System.out.println(j + " ");
			}
			System.out.println("End of the inner for-loop");
			// control comes here after breaking from inner loop
		}
		System.out.println("End of the outer for-loop");
	}

}

/*
 * Explanation:
 * 
 * In the above example, we see that there are two for loops, one inside the
 * other. Let us name the i loop as outer and the j loop as inner.
 * 
 * The outer loop starts iterating from 1 till it reaches 3. For every iteration
 * of the outer loop, the inner loop iterates from 1 to 6.
 * 
 * Inside the inner loop, we have a print statement for j and we also have an
 * if-condition that contains a break statement. This condition holds only when
 * i, becomes equal to 4.
 * 
 * The same process repeats for i=2 and 3, after which the outer loop ends and
 * the statement “End of outer loop” gets printed.
 * 
 * If we observe the above code we see that each time the break statement
 * terminates only the inner loop whereas the outer loop was unaffected
 * throughout the execution of the program.
 * 
 * An important point to note here is that the break statement always breaks or
 * terminates the execution of the innermost for loop that it is present in.
 */
