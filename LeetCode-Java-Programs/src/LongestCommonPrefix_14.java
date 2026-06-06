/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix_14 solution = new LongestCommonPrefix_14();

        String[] strs1 = { "flower", "flow", "flight" };
        System.out.println(solution.longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = { "dog", "racecar", "car" };
        System.out.println(solution.longestCommonPrefix(strs2)); // Output: ""
    }

}