package java8_programs;

import java.util.function.Predicate;

public class Check_Prime_Number_Using_Predicate_Lambda_Expression {

	public static void main(String[] args) {
		System.out.println("Starting Check_Prime_Number_Using_Lambda_Expression....");
		// Define the prime check lambda expression
		Predicate<Integer> primeCheckPredicate = (given_num) -> {
			if (given_num <= 1) {
				return false;
			}
			for (int p = 2; p < given_num; p++) {
				if (given_num % p == 0) {
					return false;
				}
			}
			return true;
		};

		Integer user_num = 15;
		Boolean isPrime = primeCheckPredicate.test(user_num);
		System.out.println("The Given Number " + user_num + " is prime number? " + isPrime);
	}
}
/*
 * Explanation:
 * 
 * In the main method, we define a lambda expression using the
 * Predicate<Integer>. This functional interface represents a predicate
 * (boolean-valued function) of one argument.
 * 
 * The lambda expression checks if a given number n is prime. It first checks if
 * the number is less than or equal to 1, returning false. Then, it uses a for
 * loop to iterate from 2 to the (n-1). It checks if n is divisible by any
 * number within this range. If it is, it gives false, indicating that the
 * number is not prime. Otherwise, it returns true, indicating the number is
 * prime.
 * 
 * After defining the lambda expression, we use it to check if a number is
 * prime. We do this by calling the test method on the lambda expression and
 * passing the number as an argument. The result is stored in the isPrime
 * variable, which is a boolean.
 */