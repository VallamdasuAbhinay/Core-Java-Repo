package abhinay.strings;

public class Core_Java_Remove_Leading_and_Trailing_Spaces_From_String {

	public static void main(String[] args) {
		String str = "abc  def ghi\t";
		String str_upd = str.trim();
		System.out.println("String str modified using trim() ----> "+str_upd);
		
		String str1 = "  abc  def\t";
		str1 = str1.strip();
		System.out.println("String str1 modified using strip() ----> "+str1);
	}

}

/*
 * The String class contains two methods to remove leading and trailing
 * whitespaces: trim() and strip(). The strip() method was added to the String
 * class in Java 11. The strip() method uses the Character.isWhitespace() method
 * to check if the character is a whitespace. This method uses Unicode code
 * points, while the trim() method identifies any character with a codepoint
 * value less than or equal to U+0020 as a whitespace character.
 */
/*
 * The strip() method is the recommended way to remove whitespaces because it
 * uses the Unicode standard.
 */