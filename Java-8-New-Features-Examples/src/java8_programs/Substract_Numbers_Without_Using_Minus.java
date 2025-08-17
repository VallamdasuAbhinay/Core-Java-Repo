package java8_programs;

public class Substract_Numbers_Without_Using_Minus {

	public static void main(String[] args) {
		Integer a = 100;
		Integer b = 60;

		Integer result = a + (~b + 1);
		System.out.println("Substraction of numbers " + a + " and " + b + " is " + result);
	}

	/*
	 * Explanation
	 * 
	 * Here, we are calculation the difference of 2 numbers without using the "-"
	 * operator.
	 * 
	 * We are making use of Bitwise NOT operator (i.e., ~)
	 * 
	 * By applying the bitwise not operator on a number, it will flip all the bits
	 * on that number.
	 * 
	 * Finally we added "1" to "~b" because the negation of a number is always "1"
	 * less than the original number.
	 */

}
