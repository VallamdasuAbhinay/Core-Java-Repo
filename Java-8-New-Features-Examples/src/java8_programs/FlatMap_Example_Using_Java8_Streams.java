package java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Example_Using_Java8_Streams {

	public static void main(String[] args) {
		List<List<Integer>> nestedList = Arrays.asList(
				Arrays.asList(10, 20, 30, 40),
				Arrays.asList(50, 60),
				Arrays.asList(70, 80, 20),
				Arrays.asList(90, 100)
				);
		System.out.println("Printing the contents of nested-list before applying flatMap operation");
		nestedList.stream().forEach(System.out::println);
		
		System.out.println("Printing the contents of modified list after applying flatMap operation on nested-list");
		List<Integer> modifiedList = nestedList.stream().flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		modifiedList.stream().forEach(System.out::println);
	}

}
/* In this example, we have taken the list of list of integers and then
 * applied stream() function on it and then
 * applied flatMap(List::stream) which helps in flattening the contents from the multiple lists into single list
 * 
 * Then, we applied distinct() function to fetch only non-repeating elements and then
 * applied sorted() to fetch the elements in the ascending order and then 
 * applied forEach to print the elements after applying all these earlier functions 
 * 
 * */
