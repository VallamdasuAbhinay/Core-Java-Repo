package Java8_Lambda_Expression_Examples;

import java.util.function.Function;

public class Integer_To_Binary_Representation_Using_Lambda_Exp {

	public static void main(String[] args) {

		System.out.println("Starting Integer_To_Binary_Representation_Using_Lambda_Exp....");

		Integer num = 10;

		Function<Integer, String> convertToBinaryStringFunction = (n) -> Integer.toBinaryString(num);
		System.out.println("The Binary Representation of " + num + " is " + convertToBinaryStringFunction.apply(num));
	}
}

/*
 * Explanation: This program uses the Integer.toBinaryString(n) method to
 * convert an integer *n to its respective binary representation. The lambda
 * expression allows you I to encapsulate this conversion logic and use it as a
 * function. Function is the functional interface which accepts one argument and
 * produces the result. apply(T) is the functional method available inside this
 * Function.
 */
