package Java8_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Check_Case_Of_List_Of_Strings_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Check_Case_Of_List_Of_Strings_Using_Lambda_Exp....");
		System.out.println("--------------------");
		Boolean isLowerCase = false;
		Boolean isUpperCase = false;
		List<String> colorsListLowerCase = Arrays.asList("green", "red", "pink", "orange", "maroon");
		List<String> colorsListMixedCase = Arrays.asList("Green", "Red", "Pink", "Orange", "Maroon");
		List<String> colorsListUpperCase = Arrays.asList("GREEN", "RED", "PINK", "ORANGE", "MAROON");
		// predicate used to check if the string is in lower case
		Predicate<String> lowerCasePredicate = (str) -> {
			return (str.equals(str.toLowerCase()));
		};
		// predicate used to check if the string is in upper case
		Predicate<String> upperCasePredicate = (str) -> {
			return (str.equals(str.toUpperCase()));
		};
		System.out.println("Initial values in the lower case list are...." + colorsListLowerCase);
		isLowerCase = colorsListLowerCase.stream().allMatch(lowerCasePredicate);
		isUpperCase = colorsListLowerCase.stream().allMatch(upperCasePredicate);
		printResponse(isLowerCase, isUpperCase);
		System.out.println("---------------------");
		System.out.println("Initial values in the mixed case list are...." + colorsListMixedCase);
		isLowerCase = colorsListMixedCase.stream().allMatch(lowerCasePredicate);
		isUpperCase = colorsListMixedCase.stream().allMatch(upperCasePredicate);
		printResponse(isLowerCase, isUpperCase);
		System.out.println("---------------------");
		System.out.println("Initial values in the upper case list are...." + colorsListUpperCase);
		isLowerCase = colorsListUpperCase.stream().allMatch(lowerCasePredicate);
		isUpperCase = colorsListUpperCase.stream().allMatch(upperCasePredicate);
		printResponse(isLowerCase, isUpperCase);
		System.out.println("---------------------");
	}

	public static void printResponse(Boolean isLowerCase, Boolean isUpperCase) {
		if (isLowerCase) {
			System.out.println("All the elements in the above list are in lower case");
		} else if (isUpperCase) {
			System.out.println("All the elements in the above list are in upper case");
		} else {
			System.out.println("The elements in the above list are in mixed case");
		}
	}

}
/*
 * allMatch(some-predicate) will return true if all the elements of the stream
 * satisfies the condition specified in the predicate else it will return false
 */
