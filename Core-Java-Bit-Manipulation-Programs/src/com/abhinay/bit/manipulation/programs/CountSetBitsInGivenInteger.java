package com.abhinay.bit.manipulation.programs;

public class CountSetBitsInGivenInteger {
	/*
	 * Write an efficient program to count the number of 1s in the binary
	 * representation of an integer. 
	 * Example
	 * Input : n = 6 Output : 2 
	 * Binary representation of 6 is 110 and has 2 set bits
	 * 
	 * Input : n = 13 Output : 3 
	 * Binary representation of 13 is 1101 and has 3 set bits
	 */
	public static void main(String[] args) {
		System.out.println("CountSetBitsInGivenInteger Started....");
		int i = 100;
        System.out.println("Number of Set Bits in "+i+" are: " +countSetBits(i));
        int j = 93;
        System.out.println("Number of Set Bits in "+j+" are: " +countSetBitsUsingRecursion(j));
        
	}
	
	/*
	 * Function to get no of set bits in binary representation of positive integer n
	 */
	static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count += n & 1;
			n >>= 1;
		}
		return count;
	}
	
	/*
	 * Recursive Function to get no of set bits in binary representation of positive integer n
	 */
	public static int countSetBitsUsingRecursion(int n) {
		if (n == 0)
			return 0;
		else
			return (n & 1) + countSetBitsUsingRecursion(n >> 1);
	}
}
