package Java8_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda_Expression_Example_Using_Predicate_Negate_Method {

	public static void main(String[] args) {
		System.out.println("Starting Lambda_Expression_Example_Using_Predicate_Negate_Method....");
		List<String> companiesList = Arrays.asList("Google", "Deloitte", "Mindtree", "Twitter", "Amazon");
		System.out.println("Initial list of the companies are....\n" + companiesList);
		Predicate<String> companiesWhoseLengthIs6_Predicate = (company) -> (company.length() == 6);
		System.out.println("List of the companies whose length is not equals to 6 are....");
		companiesList.stream().filter(companiesWhoseLengthIs6_Predicate.negate()).forEach(System.out::println);
		
	}

}
/*
 * Explanation:
 * 
 * In the above exercise, we have defined the following Predicate functional
 * interface companiesWhoseLengthIs6_Predicate --> This predicate is used to
 * check the company names whose length is equal to 6
 * 
 * In above example, we are returning companies whose length is == 6, but it is
 * negate() predicate so it is returned opposite of that. means it returns
 * companies whose length is not equal to 6.
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
 * boolean test() - abstract method Evaluates this predicate on the given
 * argument.
 * 
 * and() - default method Returns a composed predicate that represents a logical
 * AND. When evaluating the composed predicate, if this predicate is false, then
 * the other predicate is not evaluated.
 * 
 * negate() - default Returns a predicate that represents the logical negation
 * of this predicate. It will return opposite of given condition.
 * 
 * method or() - default method Returns a composed predicate that represents a
 * logical OR. Return true if any condition becomes true in given predicate.
 * 
 * isEqual() - static method It returns a predicate that tests if two arguments
 * are equal according to Objects.equals(Object, Object).
 * 
 */