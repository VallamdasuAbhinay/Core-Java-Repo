package Java8_Examples;

import java.util.Arrays;
import java.util.List;

public class Sum_Of_Squares_Of_Even_Numbers_In_Integer_List_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Sum_Of_Squares_Of_Even_Numbers_In_Integer_List_Lambda_Exp....");
		List<Integer> numsList = Arrays.asList(2, 4, 1, 6, 3);
		System.out.println("Initial  Elements in the list are....\n" + numsList);
		Integer sum_of_squares_of_even_nums = numsList.stream().filter(x -> x % 2 == 0).mapToInt(y -> y * y).sum();
		System.out.println("Sum of squares of even numbers in the list is " + sum_of_squares_of_even_nums);
	}

}
//Explanation:
//	
//	filter is applied on the stream to check even number (number divided by 2 gives 0 remainder).
//	Then, mapToInt is applied to calculate sum of the filtered even numbers.
//	Finally, sum() is applied on mapToInt() to calculate sum of the squares of even numbers