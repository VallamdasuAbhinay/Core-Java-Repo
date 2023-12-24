package com.abhinay.break$statement;

public class Break_Statement_Example_Using_Nested_For_Loop_And_Labels {

	public static void main(String[] args) {
		outer: for (int i = 1; i < 4; i++) {// outer for-loop
			inner: for (int j = 1; j < 7; j++) {// inner for-loop
				if (j == 2) {
					break inner;
				}
				// when value of j becomes 4, the outer for-loop gets terminated
				if (j == 4) {
					break outer;
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
 * Till now we have seen how to break from nested for loops. But the problem was
 * that we could break only from the innermost loop.
 * 
 * What if we wanted to break from the outermost loop or a loop of our choice?
 * For this, we use the label keyword.
 * 
 * Explanation:
 * 
 * In the above example, we see that there are two for loops, one inside the
 * other. Let us name the i loop as outer and the j one as inner.
 * 
 * The outer loop starts iterating from 1 till it reaches 3, and for every
 * iteration of the outer, the inner loop iterates from 1 to 6.
 * 
 * Inside the inner loop, we have a print statement for j and we also have two
 * if-conditions having a break statement, that holds only when i, becomes equal
 * to 2 or 4.
 * 
 * Since here, the ith loop is labeled as outer, the control moves out of the
 * outer loop as well and it goes to the print statement “End of outer loop”.
 * 
 * An important point to note here is that if the break statement is used with a
 * label, then the control moves out of the code structure having that label.
 */
