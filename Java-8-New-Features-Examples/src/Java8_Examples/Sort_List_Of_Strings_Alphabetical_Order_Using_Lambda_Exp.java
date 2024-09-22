package Java8_Examples;

import java.util.Arrays;
import java.util.List;

public class Sort_List_Of_Strings_Alphabetical_Order_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Sort_List_Of_Strings_Alphabetical_Order_Using_Lambda_Exp....");
		List<String> flowersList = Arrays.asList("Lotus", "Jasmine", "Rose", "Lily", "Lavender", "Sunflower");
		System.out.println("Initial list of flowers are....\n" + flowersList);
		// Sort the list of strings in alphabetical order using lambda expression
		flowersList.sort((flower_1, flower_2) -> (flower_1.compareToIgnoreCase(flower_2)));
		System.out.println("List of the flowers sorted in Alphabetical Order....\n" + flowersList);
	}

}
/*
 * Explanation:
 * 
 * First create a list of flowers called flowersList using the Arrays.asList() method
 * and print the original list elements.
 * 
 * To sort the strings list alphabetically, we use the sort method on the colors
 * list. The lambda expression (str1, str2) -> str1.compareToIgnoreCase(str2) is
 * used as a comparator. It compares two strings lexicographically, ignoring the
 * case, using the compareToIgnoreCase method.
 * 
 * After sorting the list, we print the sorted list of strings.
 */