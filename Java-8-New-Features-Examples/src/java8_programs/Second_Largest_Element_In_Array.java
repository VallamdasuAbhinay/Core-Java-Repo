package java8_programs;

import java.util.Arrays;
import java.util.Comparator;

public class Second_Largest_Element_In_Array {

	public static void main(String[] args) {
		int[] arr = { 12, 12, 12, 10 };
		Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresentOrElse(
				(secondLargestElement) -> System.out
						.println("Second Largest Element In Array is " + secondLargestElement),
				() -> System.out.println(-1));
	}

}

/*
 * Explanation
 * 
 * In above example, we are finding the second largest element in the given
 * array.
 * 
 * Here, 2nd largest element must not be equal to 1st largest element. 
 * 
 * If all the elements in array are same, it will return -1. 
 * 
 * If there is no 2nd largest element, it will return -1.
 * 
 * In Java 8, we need to use boxed() method when you need to convert a primitive streams
 * (like IntStream, LongStream, or DoubleStream) into a Stream of wrapper
 * objects (like Stream<Integer>, Stream<Long>, or Stream<Double> respectively).
 * 
 * Then only we will be able to apply the sorted(Comparator.reverseOrder) on that stream.
 */
