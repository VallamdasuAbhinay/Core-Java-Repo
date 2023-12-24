package abhinay.strings;

import java.util.Scanner;

public class Core_Java_Replace_Vowels_In_String {

	public static void main(String[] args) {
		System.out.println("Please Enter String..........");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();// "Don't underestimate the power of a common man";
		String replacedString = "";
		for (int i = 0; i < inputString.length(); i++) {
			// In below if condition, we are checking whether the character in the
			// input string
			// is a vowel or not.
			// If it is vowel, we are replacing that character with *
			if (inputString.charAt(i) == (char) ('a') || inputString.charAt(i) == (char) ('A')
					|| inputString.charAt(i) == (char) ('e') || inputString.charAt(i) == (char) ('E')
					|| inputString.charAt(i) == (char) ('i') || inputString.charAt(i) == (char) ('I')
					|| inputString.charAt(i) == (char) ('o') || inputString.charAt(i) == (char) ('O')
					|| inputString.charAt(i) == (char) ('u') || inputString.charAt(i) == (char) ('U')) {
				replacedString = replacedString + (char) ('*');
			} else {
				replacedString = replacedString + inputString.charAt(i);
			}
		}
		scanner.close();
		System.out.println("Modified String: " + replacedString);
	}

}
