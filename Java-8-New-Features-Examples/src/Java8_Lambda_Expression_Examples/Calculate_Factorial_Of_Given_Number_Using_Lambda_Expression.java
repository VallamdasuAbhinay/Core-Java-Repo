package Java8_Lambda_Expression_Examples;

public class Calculate_Factorial_Of_Given_Number_Using_Lambda_Expression {

	public static void main(String[] args) {
		System.out.println("Starting Calculate_Factorial_Of_Given_Number_Using_Lambda_Expression....");
		FunctionalInterface_CalculateFactorial abhi_factorial = (num) -> {
			Long result = 1l;
			for (int f = 1; f <= num; f++) {
				result = result * f;
			}
			return result;
		};

		Integer user_num = 10;
		System.out
				.println("Factorial of the number " + user_num + " is " + abhi_factorial.calculateFactorial(user_num));
	}
}
/*
 * Explanation:
 * 
 * In the above exercise, we have created a custom function interface called
 * "FunctionalInterface_CalculateFactorial" and it has the single abstract method called
 * "calculateFactorial"
 * 
 * Using Lambda expression we have provided the implementation for the logic of
 * calculating the factorial of any given number and it's being assigned to
 * abhi_factorial
 * 
 * In order to calculate the factorial, we have called the calculateFactorial
 * method by passing the value in integer variable user_num
 * 
 * Lastly, we printed the factorial result
 */