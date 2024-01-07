package Java8_Lambda_Expression_Examples;

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
	}

}
//Apply the distinct operation to remove any duplicate elements.

//Use the Arrays.asList(..) method to convert the array into a stream of integers.

//sort the elements in the default order (ascending)

//Skip the first element (the minimum) using skip(1).

//Find the first element remaining, which will be the second minimum, using findFirst().

//If the stream is empty, we return null using orElse (null). 

//The result is stored in the variable second_min.
