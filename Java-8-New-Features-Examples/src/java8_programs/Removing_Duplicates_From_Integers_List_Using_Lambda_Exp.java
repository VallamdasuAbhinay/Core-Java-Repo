package java8_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removing_Duplicates_From_Integers_List_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Removing_Duplicates_From_Integers_List_Using_Lambda_Exp....");
		List<Integer> busNumbersList = Arrays.asList(156, 190, 524, 555, 543, 545, 555, 524);
		System.out.println("Initial elements in the list (with duplicates) are....\n" + busNumbersList);
		System.out.println("Elements in the list after removing duplicates are....");
		// Method 1 applying the distinct() on the stream and printing the elements
		busNumbersList.stream().distinct().forEach(System.out::println);
		// Method 2 by creating an empty arraylist and adding each and every element to
		// this new list
		// after applying the distinct() method
		List<Integer> uniqueNumbersList = new ArrayList<>();
		// fetching the duplicates using lambda expression and adding it to other list
		busNumbersList.stream().distinct().forEach(uniqueNumbersList::add);
		System.out.println("Elements in the list after removing duplicates are....\n" + uniqueNumbersList);

	}

}
/*
 * Explanation:
 * 
 * In the above exercise we use the stream() method on the busNumbersList to
 * convert it into a stream. We call the distinct() method to filter out
 * duplicate elements. The distinct() method ensures that only distinct elements
 * are retained in the stream.
 * 
 * Finally, we use the forEach() method and a lambda expression
 * uniqueNumbersList::add to add each unique element to the uniqueNumbersList
 * list.
 */