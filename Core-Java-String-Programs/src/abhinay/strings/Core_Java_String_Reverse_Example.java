package abhinay.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Core_Java_String_Reverse_Example {

	public static void main(String[] args) {
		// Approach-1 using traditional for-loop
		String str = "welcome";
		String reverse = "";
		int str_length = str.length();
		System.out.println("Length Of The Entered String...." + str_length);

		for (int i = str_length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("The Reverse of the Entered String is...." + reverse);

		// Approach-2 using StringBuffer
		String str1 = "hello";
		StringBuffer sb1 = new StringBuffer(str1).reverse();
		System.out.println("Reversed String .... " + sb1.toString());

		// Approach-3 using StringBuilder
		String str2 = "Lenovo";
		StringBuilder sb2 = new StringBuilder(str2).reverse();
		System.out.println("Reversed String .... " + sb2.toString());

		// Approach-4 using Java8 Streams
		String str3 = "progress";
		String str3_rev = IntStream.rangeClosed(0, str3.length()-1).mapToObj(i -> str3.charAt(str3.length() - i - 1))
				.map(String::valueOf).collect(Collectors.joining());
		System.out.println("Reversed String...." + str3_rev);
	}

}
