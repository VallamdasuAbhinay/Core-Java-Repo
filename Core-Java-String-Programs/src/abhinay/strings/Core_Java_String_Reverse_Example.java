package abhinay.strings;

import java.util.Scanner;

public class Core_Java_String_Reverse_Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String....");

		String str = scanner.next();
		String reverse = "";
		int str_length = str.length();
		System.out.println("Length Of The Entered String....\n\n" + str_length);

		for (int i = str_length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		scanner.close();
		System.out.println("The Reverse of the Entered String is...." + reverse);
	}

}
