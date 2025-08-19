package java8_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repeating_Character_In_String_Without_Java8_Streams {

	public static void main(String[] args) {
		String str = "aeroaero"; // Output :: First Non Repeating Character Not Found
		String str2 = "aeroplane"; // Output :: r
		Boolean firstNonRepeatingCharFound = false;
		Map<Character, Integer> charactersCountMap = new LinkedHashMap<>();
		for (Character ch : str.toCharArray()) {
			charactersCountMap.put(ch, charactersCountMap.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> mapEntry : charactersCountMap.entrySet()) {
			if (mapEntry.getValue() == 1) {
				System.out.println("First Non Repeating Character is :: " + mapEntry.getKey());
				firstNonRepeatingCharFound = true;
				break;
			}
		}
		
		if(!firstNonRepeatingCharFound) {
			System.out.println("First Non Repeating Character Not Found");
		}
	}
	
	/* Explanation 
	 * 
	 * In this program, we are trying to calculate the first non-repeating character in a string
	 * without using any Java 8 Streams or filters etc.
	 * 
	 * getOrDefault method that was applied on map takes 2 arguments:
	 * 
	 * (ch, 0) ---- where it will search in the map if any key matches with the provided key "ch"
	 * 
	 * If key is found, then it retrieves it's respective value and adds "1" to it. (Since that key appeared more than one time)
	 * 
	 * If key is not found, then it takes the provided default value i.e., "0" and adds "1" to it.
	 * 
	 * */

}
