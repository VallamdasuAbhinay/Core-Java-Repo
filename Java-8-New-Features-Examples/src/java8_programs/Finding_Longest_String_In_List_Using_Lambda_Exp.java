package java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Finding_Longest_String_In_List_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Finding_Longest_String_In_List_Using_Lambda_Exp....");
		List<String> colorsList = Arrays.asList("Green", "Pink", "Orange", "Red", "Black");
		System.out.println("Initial elements in the list are...." + colorsList);
		String longString = colorsList.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("Longest Length String is " + longString);
		Integer longStringLength = colorsList.stream().mapToInt(String::length).max().orElse(0);
		System.out.println("Longest String Length is " + longStringLength);
	}

}
/*
 * max() is applied on the stream with the Comparator interface where it is
 * comparing based on the string length get() is used to fetch string name which
 * satisfied logic in Comparator
 */