import java.util.*;

/*
 * Given a string s, find the length of the longest substring 
 * without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. 
Note that "bca" and "cab" are also correct answers.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, 
"pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingChars_03 {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	
	    public static int lengthOfLongestSubstring(String s) {
	        Map<Character, Integer> map = new HashMap<>();
	        int start = 0;
	        int maxLength = 0;
	        for(int i=0;i<s.length();i++){
	            char ch = s.charAt(i);

	            if(map.containsKey(ch) && map.get(ch) >= start){
	                start = map.get(ch)+1;
	            }

	            map.put(ch, i);

	            maxLength = Math.max(maxLength, i-start+1);

	        }
	        return maxLength;
	    }

}


