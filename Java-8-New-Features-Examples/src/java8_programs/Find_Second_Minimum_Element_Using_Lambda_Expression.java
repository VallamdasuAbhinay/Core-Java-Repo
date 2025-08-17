package java8_programs;

import java.util.Arrays;

public class Find_Second_Minimum_Element_Using_Lambda_Expression {

	public static void main(String[] args) {
		System.out.println("Starting Find_Second_Minimum_Element_Using_Lambda_Expression....");
		Integer[] marksArray = { 100, 30, 100, 40, 10, 4, 4 };
		System.out.println("Initial elements in the array are....");
		Arrays.asList(marksArray).stream().forEach(System.out::println);
		System.out.println("");
		// by default sorted() will sort the elements in the ascending order
		Integer second_min = Arrays.asList(marksArray).stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println("Second Minimum Element is " + second_min);

		Integer[] scoresArray = { 100, 30, 100, 40, 190, 48, 400, 200, 100 };
		System.out.println("Initial elements in the array are....");
		Arrays.stream(scoresArray).forEach(System.out::println);
		System.out.println("");
		System.out.println("Initial elements in the array (sorted) are....");
		Arrays.stream(scoresArray).sorted().forEach(System.out::println);
		// by default sorted() will sort the elements in the ascending order
		Integer second_min_in_scores_array = Arrays.stream(scoresArray).distinct().sorted().skip(1).findFirst()
				.orElse(null);
		System.out.println("Second Minimum Element is " + second_min_in_scores_array);
	}

}
//Apply the distinct operation to remove any duplicate elements.

//Use the Arrays.asList(..) method to convert the array into a stream of integers.

//sort the elements in the default order (ascending)

//Skip the first element (the minimum) using skip(1).

//Find the first element remaining, which will be the second minimum, using findFirst().

//If the stream is empty, we return null using orElse (null). 

//The result is stored in the variable second_min.
