package Find_the_Length_of_the_Longest_Common_Prefix_Q3043_Medium;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        /*
         * Approach:
         * - Compare every number in arr1 with every number in arr2.
         * - Convert both numbers to strings to compare digit-by-digit.
         * - For each pair, compute the length of the common prefix.
         * - Keep track of the maximum prefix length found across all pairs.
         *
         * Time Complexity:
         * - O(n1 * n2 * k), where k is the average number of digits in the numbers.
         *
         * Note:
         * - This is a brute-force approach and may be optimized using hashing or prefix trees.
         */

        int n1 = arr1.length;
        int n2 = arr2.length;
        int longest = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {

                String s1 = String.valueOf(arr1[i]);
                String s2 = String.valueOf(arr2[j]);

                int len = 0;

                while (len < s1.length() &&
                        len < s2.length() &&
                        s1.charAt(len) == s2.charAt(len)) {
                    len++;
                }

                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}