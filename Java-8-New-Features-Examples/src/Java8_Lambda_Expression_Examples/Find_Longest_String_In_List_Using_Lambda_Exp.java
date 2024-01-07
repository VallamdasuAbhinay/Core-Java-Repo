package Java8_Lambda_Expression_Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_Longest_String_In_List_Using_Lambda_Exp {

	public static void main(String[] args) {

		System.out.println("Starting Find_Longest_String_In_List_Using_Lambda_Exp....");
		List<String> colorsList = Arrays.asList("Orange", "Green", "Black", "White", "Red");
		System.out.println("Initial elements in the list are....\n" + colorsList);
		// finding longest length string using lambda expression
		String maxlengthString = colorsList.stream().max(Comparator.comparingInt(String::length)).get();
		// another way to fetch the longest string length from the list  
		//Integer maxLength = colorsList.stream().mapToInt(String:: length).max().orElse(0);
		System.out.println("Longest Length String is " + maxlengthString);
		System.out.println("Length of longest string is " + maxlengthString.length());
	}
}
/*
 * Steps: Applied the stream() on the colorsList max() is applied on the stream
 * with the Comparator interface where it is comparing based on string length
 * get() will provide the string name which satisfied the Comparator logic
 */