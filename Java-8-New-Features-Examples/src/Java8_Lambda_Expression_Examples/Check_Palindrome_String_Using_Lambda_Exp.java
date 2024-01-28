package Java8_Lambda_Expression_Examples;

import java.util.function.Predicate;

public class Check_Palindrome_String_Using_Lambda_Exp {

	public static void main(String[] args) {
		System.out.println("Starting Check_Palindrome_String_Using_Lambda_Exp....");
		//below predicate defines lambda expression to check the palindrome logic
		Predicate<String> palindromePredicate = (str) -> {
			StringBuffer str_buffer = new StringBuffer(str).reverse();
			return str_buffer.toString().equals(str);
		};
		String str_1 = "madam";
		String str_2 = "rocket";
		String str_3 = "laptop";
		System.out.println("Is " + str_1 + " is Palindrome? " + palindromePredicate.test(str_1));
		System.out.println("Is " + str_2 + " is Palindrome? " + palindromePredicate.test(str_2));
		System.out.println("Is " + str_3 + " is Palindrome? " + palindromePredicate.test(str_3));
	}

}
