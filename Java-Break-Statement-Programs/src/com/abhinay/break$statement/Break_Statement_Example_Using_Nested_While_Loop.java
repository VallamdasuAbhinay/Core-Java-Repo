package com.abhinay.break$statement;

public class Break_Statement_Example_Using_Nested_While_Loop {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {//outer while-loop
			int j = 1;
			while (j < 5) {//inner while-loop
				if (j == 4) {
					break;
				}
				System.out.print(j + " ");
				j++;
			}
			System.out.println("End of inner while-loop");
			i++;
		}
		System.out.println("End of outer while-loop");
	}

}
