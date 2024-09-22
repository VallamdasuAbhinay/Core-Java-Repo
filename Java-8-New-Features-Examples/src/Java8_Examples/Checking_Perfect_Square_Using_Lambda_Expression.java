package Java8_Examples;

import java.util.function.Predicate;

public class Checking_Perfect_Square_Using_Lambda_Expression {
	public static void main(String[] args) {

		System.out.println("Starting Checking_Perfect_Square_Using_Lambda_Expression....");

		Predicate<Integer> perfectSquarePredicate = (num) -> {
			int sq = (int) Math.sqrt(num);
			return ((sq * sq) == num);
		};

		Integer num1 = 6;

		System.out.println("Is " + num1 + " a perfect square? " + perfectSquarePredicate.test(num1));

		Integer num2 = 26;

		System.out.println("Is " + num2 + " a perfect square? " + perfectSquarePredicate.test(num2));

		Integer num3 = 36;

		System.out.println("Is " + num3 + " a perfect square? " + perfectSquarePredicate.test(num3));

	}

}

/*
 * 
 * The perfect square or square number is a positive integer that is square of
 * an integer. In other words, when we multiply two same numbers together, then
 * the product that we get is called the perfect square.
 * 
 * Import the Predicate functional interface. In the main method, we define the
 * lambda expression perfectSquarePredicate, which takes an integer num. The
 * lambda expression checks if the square of the square root of num is equal to
 * num. If it is, then num is a perfect square. We test the lambda expression by
 * calling the test method with different numbers. Finally, we print the results
 * to the console.
 */
