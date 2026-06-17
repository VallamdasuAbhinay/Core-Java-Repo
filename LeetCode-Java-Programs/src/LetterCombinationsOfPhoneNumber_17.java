/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]


Example 2:

Input: digits = "2"
Output: ["a","b","c"]
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfPhoneNumber_17 {
    private static final String[] KEYPAD = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        result.add("");
        for (char ch : digits.toCharArray()) {
            String letters = KEYPAD[ch - '0'];
            List<String> inner = new ArrayList<>();
            for (String prefix : result) {
                for (int i = 0; i < letters.length(); i++) {
                    inner.add(prefix + letters.charAt(i));
                }
            }
            result = inner;
        }
        return result;
    }

    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber_17 solution = new LetterCombinationsOfPhoneNumber_17();

        String digits1 = "23";
        System.out.println(solution.letterCombinations(digits1)); // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]

        String digits2 = "2";
        System.out.println(solution.letterCombinations(digits2)); // Output: [a, b, c]
    }
}