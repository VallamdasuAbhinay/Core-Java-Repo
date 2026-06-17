/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Example 4:

Input: s = "([])"
Output: true

Example 5:

Input: s = "([)]"
Output: false
*/

import java.util.Stack;

public class ValidParentheses_20 {

    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                charStack.push(ch);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }
                char top = charStack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses_20 solution = new ValidParentheses_20();

        String s1 = "()";
        System.out.println(solution.isValid(s1)); // Output: true

        String s2 = "()[]{}";
        System.out.println(solution.isValid(s2)); // Output: true

        String s3 = "(]";
        System.out.println(solution.isValid(s3)); // Output: false

        String s4 = "([])";
        System.out.println(solution.isValid(s4)); // Output: true

        String s5 = "([)]";
        System.out.println(solution.isValid(s5)); // Output: false
    }
}
