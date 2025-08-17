package java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering_Even_Odd_Numbers_From_Numbers_List_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Filtering_Even_Odd_Numbers_From_Numbers_List_Using_Lambda_Exp....");
		List<Integer> numList = Arrays.asList(20, 44, 90, 33, 11, 17, 209);
		System.out.println("Initial Numbers in the list are....\n"+numList);
		// Filter out even numbers using lambda expression
		List<Integer> evenNumsList =numList.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers List...."+evenNumsList);
		// Filter out odd numbers using lambda expression
		List<Integer> oddNumsList =numList.stream().filter(x -> x%2 != 0).collect(Collectors.toList());
		System.out.println("Odd Numbers List...."+oddNumsList);
	}

}
/*
 * Explanation:
 * 
 * At first create a list of integers called numList using the Arrays.asList()
 * method and print the original list.
 * 
 * To filter out even numbers, we use the stream() method on the list numList to
 * convert it into a stream. Now apply a lambda expression with the filter()
 * method. The lambda expression (x -> x % 2 == 0) checks if a number is
 * divisible by 2 (i.e., even). We collect the filtered even numbers into a new
 * list using the collect() method with Collectors.toList().
 * 
 * To filter out odd numbers, we use a similar approach. We again use the
 * stream() method on the numList list, apply a lambda expression (x -> x % 2
 * != 0) to check if a number is not divisible by 2 (i.e., odd), and collect the
 * filtered odd numbers into a new list using collect() and Collectors.toList().
 */