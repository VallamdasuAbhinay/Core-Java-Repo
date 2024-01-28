package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Finding_Smallest_String_In_List_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Finding_Smallest_String_In_List_Using_Lambda_Exp....");
		List<String> colorsList = Arrays.asList("Green", "Pink", "Orange", "Red", "Black");
		System.out.println("Initial elements in the list are...." + colorsList);
		String minString = colorsList.stream().min(Comparator.comparingInt(String::length)).get();
		System.out.println("Minimum Length String is " + minString);
		Integer minStringLength = colorsList.stream().mapToInt(String::length).min().orElse(0);
		System.out.println("Minimum String Length is " + minStringLength);
	}

}
/*
 * min() is applied on the stream with the Comparator interface where it is
 * comparing based on the string length get() is used to fetch string name which
 * satisfied logic in Comparator
 */