package com.abhinay.multidimensional.arrays;

public class Displaying_2D_Array_Elements_In_Matrix_Format {

	public static void main(String[] args) {
		int[][] multi_dim_array = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }, { 100, 110, 120 } };
		System.out.println("Number of the rows in multi_dim_array are " + multi_dim_array.length);
		for (int i = 0; i < multi_dim_array.length; i++) {
			System.out.println("Number of the columns in the " + (i + 1) + " row are " + multi_dim_array[i].length);
		}
		//traversing through the multi dimensional array and printing them in the Matrix Format
		System.out.println("\nData Representation in Matrix format:");
		for (int row = 0; row < multi_dim_array.length; row++) {
			for (int column = 0; column < multi_dim_array[row].length; column++) {
				System.out.print(multi_dim_array[row][column]+"\t");
			}
			System.out.println();
		}

	}

}
