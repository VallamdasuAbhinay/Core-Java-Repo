package Java8_Lambda_Expression_Examples;

import java.util.function.Predicate;

public class Check_Empty_String_Using_Lambda_Expression_Predicate_Test_Method {

	public static void main(String[] args) {
		System.out.println("Starting Check_Empty_String_Using_Lambda_Expression_Predicate_Test_Method....");
		Predicate<String> isEmptyString = (cust_str) -> (cust_str.isEmpty());
		String cust_str_1 = "";
		String cust_str_2 = "Abhinay";
		System.out.println(cust_str_2.length());
		System.out.println("First String is :: " + cust_str_1);
		System.out.println("Whether the First String is Empty --> " + isEmptyString.test(cust_str_1));
		System.out.println("Second String is :: " + cust_str_2);
		System.out.println("Whether the Second String is Empty --> " + isEmptyString.test(cust_str_2));
	}

}
/*
 * Explanation:
 * 
 * In the above exercise, we define a Predicate functional interface with a
 * lambda expression to check if a given string is empty. The lambda expression
 * uses the isEmpty() method of the String class to determine if the string is
 * empty.
 * 
 * Predicate is a functional interface representing a single argument function
 * that returns a boolean value.
 * 
 * Predicates in Java are implemented with interfaces. Predicate<T> is a generic
 * functional interface representing a single argument function that returns a
 * boolean value. It is located in the java.util.function package. It contains a
 * Test (T t) method that evaluates the predicate on the given argument.
 * 
 * To check if the strings are empty, we create two test cases, cust_str_1 and
 * cust_str_2, and use the test() method of the Predicate interface.
 */