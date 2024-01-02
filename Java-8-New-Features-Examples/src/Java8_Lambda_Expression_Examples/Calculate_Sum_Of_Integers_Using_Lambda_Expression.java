package Java8_Lambda_Expression_Examples;

public class Calculate_Sum_Of_Integers_Using_Lambda_Expression {

	public static void main(String[] args) {
		Integer a = 100;
		Integer b = 300;
		System.out.println("Starting Calculate_Sum_Of_Integers_Using_Lambda_Expression....");
		AbhinaySum abhinaySum = (x, y) -> (x + y);
		Integer result = abhinaySum.calculateSum(a, b);
		System.out.println("The sum of the integers " + a + " and " + b + " is " + result);
	}

}

/*
 * Explanation:
 * 
 * In the above exercise, a functional interface named AbhinaySum is defined.
 * This interface has a single abstract method called calculateSum that takes
 * two integer parameters and returns an integer result. The lambda expression
 * (x, y) -> x + y is used to implement this method. It takes two integers, x
 * and y, and returns their sum.
 * 
 * In the main method, an instance of the AbhinaySum interface is created using
 * the lambda expression and assigned to the variable sumCalculator. For
 * calculating the sum, the abhinaySum is invoked with pairs of integer
 * arguments. System.out.println prints the results to the console from the
 * result variable.
 */