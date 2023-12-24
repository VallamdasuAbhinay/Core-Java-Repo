package com.abhinay.bit.manipulation.programs;

public class CountSetBitsInGivenIntegerUsingIntegerWrapperClass {

	public static void main(String[] args) {
		int a = 999;
		System.out.println("Set Bits count in " + a + " are: " + Integer.bitCount(a));
		int b = 100;
		System.out.println("Set Bits count in " + b + " are: " + Integer.bitCount(b));
	}

}
