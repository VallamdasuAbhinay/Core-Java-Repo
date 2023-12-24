package com.abhinay.bit.manipulation.programs;

public class CountSetBitsInGivenIntegerUsingBrianKernighansAlgorithm {
	/*
	 * Brian Kernighan’s Algorithm: 
	 * Subtracting 1 from a decimal number flips all
	 * the bits after the rightmost set bit(which is 1) including the rightmost set
	 * bit. 
	 * For Example : 
	 * 10 in binary is 00001010 
	 * 9 in binary is 00001001 
	 * 8 in binary is 00001000 
	 * 7 in binary is 00000111 
	 * So if we subtract a number by 1
	 * and do it bitwise & with itself (n & (n-1)), we unset the rightmost set bit.
	 * If we do n & (n-1) in a loop and count the number of times the loop executes,
	 * we get the set bit count. The beauty of this solution is the number of times
	 * it loops is equal to the number of set bits in a given integer.
	 */
	public static void main(String[] args) {
		int i = 9;
        System.out.println(countSetBits(i));
        int j = 99;
        System.out.println(countSetBitsUsingRecursion(j));
	}
	
	/*
	 * Function to get no of set bits in binary representation of passed binary no.
	 */
	static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			n &= (n - 1);
			count++;
		}
		return count;
	}
	
	/*
	 * Recursive Function to get no of set bits in binary representation of passed
	 * binary no.
	 */
	static int countSetBitsUsingRecursion(int n) {
		if (n == 0)
			return 0;
		else
			return 1 + countSetBitsUsingRecursion(n & (n - 1));
	}
}
