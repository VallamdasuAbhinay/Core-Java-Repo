package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.Comparator;

public class Find_Second_Maximum_Element_Using_Lambda_Expression {
	public static void main(String[] args) {
		System.out.println("Starting Find_Second_Maximum_Element_Using_Lambda_Expression....");
		Integer[] marksArray = { 100, 30, 100, 40, 10, 4, 4 };
		System.out.println("Initial elements in the array are....");
		Arrays.asList(marksArray).stream().forEach(System.out::println);
		System.out.println("");
		// by default sorted() will sort the elements in the ascending order
		Integer second_max = Arrays.asList(marksArray).stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().orElse(null);
		System.out.println("Second Maximum Element is " + second_max);
	}
}

//Apply the distinct operation to remove any duplicate elements.

//Use the Arrays.asList(..) method to convert the array into a stream of integers.

//Sort the elements in reverse order using Comparator.reverseOrder() (means in descending order)

//Skip the first element (the maximum) using skip(1).

//Find the first element remaining, which will be the second largest, using findFirst().

//If the stream is empty, we return null using orElse (null). 27 //The result is stored in the variable second_max.
