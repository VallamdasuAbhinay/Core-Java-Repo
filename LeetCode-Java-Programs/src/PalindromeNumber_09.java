/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.


Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. 
Therefore it is not a palindrome.


Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. 
Therefore it is not a palindrome.
 *
 */
public class PalindromeNumber_09 {

	public static void main(String[] args) {
		System.out.println("Is 121 is palindrome?" + isPalindrome(121));
		System.out.println("Is -121 is palindrome?" + isPalindrome(-121));
	}
	
	    public static boolean isPalindrome(int x) {
	        if(x < 0){
	            return false;
	        }
	        int original = x;
	        int reverse = 0;
	        while(x != 0){
	            int digit = x%10;
	            reverse = (reverse * 10) + digit;
	            x = x / 10;
	        }
	        return (reverse == original);
	    }
	//Time Complexity = O(log(n)) Since in each iteration we will remove one digit from the input number

	//Space Complexity = O(1), since no additional data structures are used here

}
