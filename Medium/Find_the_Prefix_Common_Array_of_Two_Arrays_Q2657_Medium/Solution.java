
package Find_the_Prefix_Common_Array_of_Two_Arrays_Q2657_Medium;

class Solution {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        /*
         * Goal:
         * Build an array C where:
         * C[i] = number of common elements
         * between prefixes A[0...i] and B[0...i]
         *
         * Approach:
         * 1. For every index i:
         *    - Compare all elements in A's prefix
         *      with all elements in B's prefix.
         * 2. Count matches.
         * 3. Store the count in C[i].
         *
         * Time Complexity:
         * O(n^3)
         * because:
         * - outer loop runs n times
         * - two inner loops each run up to n times
         */

        int n = A.length;

        // Result array to store prefix common counts
        int[] C = new int[n];

        // Iterate through each prefix ending at index i
        for (int i = 0; i < n; i++) {

            // Stores count of common elements
            int count = 0;

            /*
             * Compare every element in A[0...i]
             * with every element in B[0...i]
             */
            for (int j = 0; j <= i; j++) {

                for (int k = 0; k <= i; k++) {

                    // If same element found, increase count
                    if (A[j] == B[k]) {
                        count++;
                    }
                }
            }

            // Store answer for current prefix
            C[i] = count;
        }

        // Return final prefix common array
        return C;
    }
}