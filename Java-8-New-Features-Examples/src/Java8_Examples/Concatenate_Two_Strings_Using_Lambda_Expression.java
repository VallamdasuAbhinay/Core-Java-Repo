package Java8_Examples;

import java.util.function.BiFunction;

public class Concatenate_Two_Strings_Using_Lambda_Expression {

	public static void main(String[] args) {
		System.out.println("Starting Concatenate_Two_Strings_Using_Lambda_Expression....");
		// Define the concatenate lambda expression
		BiFunction<String, String, String> concatenate = (str1, str2) -> (str1 + str2);
		String s1 = "Deloitte ";
		String s2 = "USI";
		String result_string = concatenate.apply(s1, s2);
		System.out.println("The concatenation of " + s1 + " and " + s2 + " is " + result_string);
	}

}
/*
 * Explanation:
 * 
 * In the above exercise -
 * 
 * From the java.util.function package, we import the BiFunction functional
 * interface.
 * 
 * In the main() method, we define a lambda expression using the
 * BiFunction<String, String, String>. This functional interface represents a
 * function that accepts two String arguments and produces a String result.
 * 
 * The lambda expression "concatenate" takes two strings str1 and str2 as input
 * and concatenates them using the + operator.
 * 
 * After defining the lambda expression, we use it to concatenate two strings by
 * calling the apply method on the lambda expression and passing the two strings
 * as arguments. The result is stored in the result variable, which is a String.
 */