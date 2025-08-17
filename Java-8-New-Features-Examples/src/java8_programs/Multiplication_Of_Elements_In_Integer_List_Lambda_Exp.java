package java8_programs;

import java.util.Arrays;
import java.util.List;

public class Multiplication_Of_Elements_In_Integer_List_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Multiplication_Of_Elements_In_Integer_List_Lambda_Exp....");
		List<Integer> numsList = Arrays.asList(2, -4, 1, 6, 3);
		System.out.println("Initial  Elements in the list are....\n" + numsList);
		Integer multiplicationResult = numsList.stream().reduce(1, (x, y) -> (x * y));
		System.out
				.println("Multiplication of all the elements in the list using lambda exp is " + multiplicationResult);
	}

}
//Lambda expression (x,y)->(x*y)
//
//using reduce() on stream of numsList.
//This Lambda Exp takes two integers x & y as input and multiplies them using * operator.
//The reduce() applies the lambda exp on every element in stream, performing Multiplication Operation.
//Initial reduction value is set to 1.