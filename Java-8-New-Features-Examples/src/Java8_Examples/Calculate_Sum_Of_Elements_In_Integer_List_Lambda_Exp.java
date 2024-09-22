package Java8_Examples;

import java.util.Arrays;
import java.util.List;

public class Calculate_Sum_Of_Elements_In_Integer_List_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Calculate_Sum_Of_Elements_In_Integer_List_Lambda_Exp....");
		List<Integer> numsList = Arrays.asList(200, -40, 100, 69, 400);
		System.out.println("Initial  Elements in the list are....\n" + numsList);
		Integer numSum = numsList.stream().reduce(0, (x, y) -> (x + y));
		System.out.println("Sum of all the elements in the list using lambda exp is " + numSum);
		Integer elemSum = numsList.stream().reduce(0, Integer::sum);
		System.out.println("Sum of all the elements in the list using method ref is " + elemSum);
	}

}
//Lambda expression (x,y)->(x+y)
//
//using reduce() on stream of numsList.
//This Lambda Exp takes two integers x & y as input and adds them using + operator.
//The reduce() applies the lambda exp on every element in stream, performing addition Operation.
//Initial reduction value is set to 0.