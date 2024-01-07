package Java8_Lambda_Expression_Examples;

import java.util.stream.IntStream;

public class Sum_Of_Primes_In_Given_Range_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Sum_Of_Primes_In_Given_Range_Using_Lambda_Exp....");

		Integer start_prime = 2;

		Integer end_prime = 10;

		System.out
				.println("The prime numbers in the inclusive range of [" + start_prime + "," + end_prime + "] are....");

		IntStream.rangeClosed(start_prime, end_prime).filter(Sum_Of_Primes_In_Given_Range_Using_Lambda_Exp::isPrime)

				.forEach(System.out::println);

		Integer prime_sum = IntStream.rangeClosed(start_prime, end_prime)
				.filter(Sum_Of_Primes_In_Given_Range_Using_Lambda_Exp::isPrime).sum();

		System.out.println("The sum of the prime numbers in the inclusive range of [" + start_prime + "," + end_prime

				+ "] is " + prime_sum);

	}

//this method is used to check if the given number is prime or not
	public static Boolean isPrime(int user_num) {
		if (user_num <= 1)
			return false;
		for (int p = 2; p < user_num; p++) {
			if (user_num % p == 0) {
				return false;
			}
		}
		return true;
	}
}
/*
 * 
 * The lambda expression Sum_Of_Primes_In_Given_Range_Using_Lambda_Exp::isPrime
 * 
 * filters out non-prime numbers from the range of numbers
 */