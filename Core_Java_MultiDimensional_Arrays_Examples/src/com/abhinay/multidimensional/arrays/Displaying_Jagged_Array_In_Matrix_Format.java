package com.abhinay.multidimensional.arrays;

public class Displaying_Jagged_Array_In_Matrix_Format {
	/*
	 * A jagged array is an array of arrays such that member arrays can be of
	 * different sizes, i.e., we can create a 2-D array but with a variable number
	 * of columns in each row. These types of arrays are also known as Jagged
	 * arrays.
	 */
	public static void main(String[] args) {
		//Declaring and initializing the jagged array
		int[][] jagged_array_a = { { 10, 20 }, { 40, 50, 60 }, { 70, 80, 90, 100 }, { 92, 93, 94, 95, 96 } };
		System.out.println("Number of the rows in jagged array are " + jagged_array_a.length);
		for (int i = 0; i < jagged_array_a.length; i++) {
			System.out.println("Number of the columns in the " + (i + 1) + " row are " + jagged_array_a[i].length);
		}
		// traversing through the multidimensional jagged array and printing them in the
		// Matrix Format
		System.out.println("\nData Representation in Matrix format:");
		for (int row = 0; row < jagged_array_a.length; row++) {
			for (int column = 0; column < jagged_array_a[row].length; column++) {
				System.out.print(jagged_array_a[row][column] + "\t");
			}
			System.out.println();
		}
		
		//Declaration of the Jagged array by providing only the number of rows (as 4) and empty columns size:
		int[][] jagged_array_b = new int[4][];
		int rows_length_b = jagged_array_b.length;
		for(int i=0; i<rows_length_b; i++) {
			jagged_array_b[i] = new int[i+1];//assigning the different column sizes for different rows
		}
		//assigning the incremental values to the jagged array
		int count = 1;
		for(int j=0; j<rows_length_b; j++) {
			for(int k=0; k<jagged_array_b[j].length; k++) {
				jagged_array_b[j][k] = count++;
			}
		}
		//displaying the jagged array in matrix format
		System.out.println("displaying the jagged array in matrix format");
		for(int j=0; j<rows_length_b; j++) {
			for(int k=0; k<jagged_array_b[j].length; k++) {
				System.out.print(jagged_array_b[j][k]+"\t");
			}
			System.out.println();
		}
		

	}

}
