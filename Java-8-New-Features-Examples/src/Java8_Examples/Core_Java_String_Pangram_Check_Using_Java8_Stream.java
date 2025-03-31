package Java8_Examples;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Core_Java_String_Pangram_Check_Using_Java8_Stream {
	// Pangram means the string/sentence which contains all the 26 english alphabets
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		String mod_str = str.toLowerCase();
		Set<String> charSet = Arrays.stream(mod_str.split("")).filter(f -> !f.isBlank()).collect(Collectors.toSet());
		if (charSet.size() == 26) {
			System.out.println("Given sentence is Pangram");
		} else {
			System.out.println("Given sentence is not Pangram");
		}
	}

}
