package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Check_Even_Odd_Lambda_Expression_Predicate_Test_Method {

	public static void main(String[] args) {
		System.out.println("Starting Check_Even_Odd_Lambda_Expression_Predicate_Test_Method....");
		Predicate<Integer> evenPredicate = (int_num) -> (int_num % 2 == 0);
		Predicate<Integer> oddPredicate = (int_num) -> (int_num % 2 != 0);
		List<Integer> integersList = Arrays.asList(100, 20, 23, 46, 50, 90, 11, 33);
		System.out.println("Even Numbers from the Array List " + integersList + " are ");
		integersList.stream().filter(evenPredicate).forEach(System.out::println);
		System.out.println("Odd Numbers from the Array List " + integersList + " are ");
		integersList.stream().filter(oddPredicate).forEach(System.out::println);
	}

}
/*
 * Explanation:
 * 
 * In the above exercise, we have defined Two Predicate functional interfaces
 * evenPredicate --> This predicate is used to check if a given number is even
 * evenPredicate --> This predicate is used to check if a given number is odd
 * 
 * Predicate is a functional interface representing a single argument function
 * that returns a boolean value.
 * 
 * Predicates in Java are implemented with interfaces. Predicate<T> is a generic
 * functional interface representing a single argument function that returns a
 * boolean value. It is located in the java.util.function package. It contains a
 * Test (T t) method that evaluates the predicate on the given argument.
 * 
 * Methods of Predicate :
 * 
 * boolean test() - abstract method 
 * Evaluates this predicate on the given argument.

 * and() - default method 
 * Returns a composed predicate that represents a logical AND. 
 * When evaluating the composed predicate, if this predicate is false, 
 * then the other predicate is not evaluated.
 * 
 * negate() - default
 * Returns a predicate that represents the logical negation of this predicate. 
 * It will return opposite of given condition.
 * 
 * method or() - default method 
 * Returns a composed predicate that represents a logical OR. 
 * Return true if any condition becomes true in given predicate.
 * 
 * isEqual() - static method
 * It returns a predicate that tests if two arguments are equal according 
 * to Objects.equals(Object, Object).
 * 
 */