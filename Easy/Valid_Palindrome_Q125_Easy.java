package Valid_Palindrome_Q125_Easy;


import java.util.Scanner;

/*
 * Thinking Process:
 * By reading this question, I understood that I can use the same idea
 * from the "Palindrome Number" problem (LeetCode Question 9).
 *
 * I initially tried using reverse string comparison logic.
 * It passed test cases 2 and 3, but failed test case 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: false
 * Expected: true
 *
 * Finding:
 * After analyzing the failure with helpof AI, I realized the issue was
 * that the string contains spaces and punctuation.
 *
 * Final Idea:(With the help of AI)
 * Remove all non-alphanumeric characters and convert everything to lowercase
 * before checking palindrome.
 */

class Solution {
    public boolean isPalindrome(String s) {

        // Remove all non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(s).reverse().toString();

        // Compare original cleaned string with reversed string
        boolean true_or_false = s.equalsIgnoreCase(reversed);

        // Return result (true if palindrome, false otherwise)
        return true_or_false;

    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read input string
        String s = sc.nextLine();

        // Create Solution object
        Solution solution = new Solution();

        // Check if palindrome
        boolean result = solution.isPalindrome(s);

        // Print result
        System.out.println(result);

    }
}
