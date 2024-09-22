package Java8_Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Largest_Prime_Factor_Of_Given_Number {

	public static void main(String[] args) {
		System.out.println("Starting Find_Largest_Prime_Factor_Of_Given_Number....");
		Integer user_num = 100;
		System.out.println("The largest prime factor of " + user_num + " is " + primeCheck(user_num));
	}

	// this method is used to get all the factors of the given number and prints it
	// and also it identifies the largest prime factor from the list
	public static int primeCheck(Integer user_num) {
		List<Integer> allFactorsList = new ArrayList<Integer>();
		for (int p = 1; p <= user_num; p++) {
			if (user_num % p == 0) {
				allFactorsList.add(p);// adding all the factors of the number to the list
			}
		}
		System.out.println("List of all the factors of the number " + user_num + " are...." + allFactorsList);
		List<Integer> primeFactorsList = allFactorsList.stream().filter(p -> isPrime(p) == true)
				.collect(Collectors.toList());
		System.out.println("List of all the prime factors of the number " + user_num + " are...." + primeFactorsList);
		// below lambda expression will filter all the prime factors of the number and
		// then applying the max() to fetch the largest prime factor and orElse(0) will
		// provide the default value of 0 if the provided list is empty
		return allFactorsList.stream().filter(p -> isPrime(p) == true).mapToInt(Integer::intValue).max().orElse(0);
	}

	// this method will check if the given number is prime or not
	public static boolean isPrime(Integer given_num) {
		if (given_num <= 1)
			return false;
		for (int p = 2; p < given_num; p++) {
			if (given_num % p == 0) {
				return false;
			}
		}
		return true;
	}

}
