
package Majority_Element_Q169_Easy;

/*
 * Find the majority element in the array.
 * A majority element is an element that appears more than n/2 times.
 *
 * Approach:
 * 1. Traverse each element of the array.
 * 2. For every element, count how many times it appears by comparing
 *    it with all other elements.
 * 3. If the count of any element exceeds n/2, return that element immediately.
 * 4. If no such element is found (which shouldn't happen if guaranteed),
 *    return -1 as a fallback.
 *
 * Time Complexity: O(n^2) due to nested loops.
 * Space Complexity: O(1) as no extra space is used.
 */

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > (n / 2)) {
                return nums[i]; // return immediately
            }
        }

        return -1; // fallback (won’t happen if majority exists)
    }
}