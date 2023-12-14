package abhinay.strings;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegularExpression {

	public static void main(String[] args) {

		// Test Case 1:
		String str1 = "Central Fill";
		System.out.println(str1 + "---->" + isValidDomain(str1));

		// Test Case 2:
		String str2 = "Central Fill 44";
		System.out.println(str2 + "---->" + isValidDomain(str2));

		// Test Case 3:
		String str3 = "Central fill 12";
		System.out.println(str3 + "---->" + isValidDomain(str3));

		// Test Case 4:
		String str4 = "central-fill-24";
		System.out.println(str4 + "---->" + isValidDomain(str4));

		// Test Case 5:
		String str5 = "CentralFill22";
		System.out.println(str5 + "---->" + isValidDomain(str5));

		// Test Case 6:
		String str6 = "CentralFill 0";
		System.out.println(str6 + "---->" + isValidDomain(str6));

		// Test Case 7:
		String str7 = "Central FILL 8.9";
		System.out.println(str7 + "---->" + isValidDomain(str7));

		// Test Case 8:
		String str8 = "cEnTrAl  FiLl";
		System.out.println(str8 + "---->" + isValidDomain(str8));

		// Test Case 9:
		String str9 = "Central Fill -9";
		System.out.println(str9 + "---->" + isValidDomain(str9));

		// Test Case 10:
		String str10 = "Central Fill 10-";
		System.out.println(str10 + " ---->" + isValidDomain(str10));

	}

	public static boolean isValidDomain(String str) {
		// Regular Expression to check valid name.
		// Valid names are "central fill" (case insensitive)
		// Valid names are "central fill x" where x can be any positive integer (case
		// insensitive)
		String regex1 = "central(\\s)fill$";
		String regex2 = "central(\\s)fill(\\s[0-9]+)$";
		// Compile the ReGex
		Pattern p1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);
		Pattern p2 = Pattern.compile(regex2, Pattern.CASE_INSENSITIVE);

		// If the string is empty
		// return false
		if (str == null) {
			System.out.println("String cannot be null.....");
			return false;
		}

		// Pattern class contains matcher()
		// method to find the matching
		// between the given string and
		// regular expression.
		Matcher m1 = p1.matcher(str.trim());
		Matcher m2 = p2.matcher(str.trim());

		return (m1.matches() || m2.matches());
	}

}
