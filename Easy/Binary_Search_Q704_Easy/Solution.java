package Binary_Search_Q704_Easy;

import java.util.Arrays;

class Solution {

    public int search(int[] nums, int target) {

        // Sort the array in ascending order
        Arrays.sort(nums);

        // Traverse through each element in the array
        for (int i = 0; i < nums.length; i++) {

            // Check if the current element matches the target
            if (nums[i] == target) {

                // Return the index of the target element
                return i;
            }
        }

        // Return -1 if target is not found in the array
        return -1;
    }
}