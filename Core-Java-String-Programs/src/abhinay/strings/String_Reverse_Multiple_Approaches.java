package abhinay.strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class String_Reverse_Multiple_Approaches {

	public static void main(String[] args) {
		// Approach-1 using traditional for-loop
		String sample = "welcome";
		String reverse_str1 = "";
		for (int i = sample.length() - 1; i >= 0; i--) {
			reverse_str1 = reverse_str1.concat(String.valueOf(sample.charAt(i)));
		}
		System.out.println("Reversed String Using traditional for-loop : " + reverse_str1);

		// Approach-2 using StringBuffer
		String str2 = "tech";
		StringBuffer stringBuffer = new StringBuffer(str2).reverse();
		System.out.println("Reversed String Using StringBuffer : " + stringBuffer);

		// Approach-3 using StringBuilder
		String str3 = "company";
		StringBuilder stringBuilder = new StringBuilder(str3).reverse();
		System.out.println("Reversed String Using StringBuilder : " + stringBuilder);

		// Approach-4A using Java 8 Streams
		String reversed_str = IntStream.range(0, sample.length())
				.mapToObj(x -> String.valueOf(sample.charAt(sample.length() - x - 1))).collect(Collectors.joining());
		System.out.println("Reversed String Using Java 8 Streams : " + reversed_str);

		// Approach-4B using Java 8 Streams and reduce
		System.out.println("Reversed String Using Java 8 Streams and Reduce Operation : "
				+ Arrays.stream(sample.split("")).reduce("", (x, y) -> (y + x)));

	}

}
