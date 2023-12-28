package com.abhinay.multidimensional.arrays;

public class Substraction_Of_Two_MultiDimensional_Arrays_Example {

	public static void main(String[] args) {
		int[][] multi_dim_array_a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }, { 100, 110, 120 } };
		int[][] multi_dim_array_b = { { 11, 21, 31 }, { 41, 51, 61 }, { 71, 81, 91 }, { 101, 111, 121 } };
		int number_of_rows = multi_dim_array_a.length; // 4 represents number of rows in multi_dim_array_a
		int number_of_columns = multi_dim_array_a[0].length; // 3 represents number of columns for row-0 in
																// multi_dim_array_a
		int[][] arrays_difference = new int[number_of_rows][number_of_columns];

		// displaying the multi_dim_array_a in Matrix format
		System.out.println("\nData Representation of Matrix A:");
		printArrayInMatrixFormat(multi_dim_array_a);
		// displaying the multi_dim_array_b in Matrix format
		System.out.println("\nData Representation of Matrix B:");
		printArrayInMatrixFormat(multi_dim_array_b);
		// traversing through the two multidimensional arrays and calculating the difference of
		// their elements
		// and storing in new multidimensional array
		System.out.println("\nData Representation in Matrix Sum:");
		for (int row = 0; row < number_of_rows; row++) {
			for (int column = 0; column < number_of_columns; column++) {
				arrays_difference[row][column] = multi_dim_array_a[row][column] - multi_dim_array_b[row][column];
			}
		}
		printArrayInMatrixFormat(arrays_difference);
	}

	public static void printArrayInMatrixFormat(int[][] result) {

		for (int r = 0; r < result.length; r++) {
			for (int c = 0; c < result[r].length; c++) {
				System.out.print(result[r][c] + "\t");
			}
			System.out.println();
		}

	}

}
