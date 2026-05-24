
package Maximum_Gap_Q164_Medium;

import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {

        // Variable to store the final answer
        int result = 0;

        // Variable to keep track of the maximum difference found
        int maxDiff = 0;

        /*
         * If the array contains only one element,
         * no adjacent comparison is possible,
         * so the maximum gap will be 0.
         */
        if(nums.length == 1){

            result = 0;

        }else{

            /*
             * Sort the array so that
             * adjacent elements can be compared easily.
             */
            Arrays.sort(nums);

            /*
             * Traverse the sorted array starting from index 1.
             * Compare each element with its previous element.
             */
            for(int i = 1; i < nums.length; i++){

                // Calculate the difference between adjacent elements
                int diff = nums[i] - nums[i - 1];

                /*
                 * Update maxDiff if the current difference
                 * is greater than the previous maximum.
                 */
                maxDiff = Math.max(diff, maxDiff);

            }

        }

        // Store the maximum gap in result
        result = maxDiff;

        // Return the final maximum gap
        return result;

    }
}