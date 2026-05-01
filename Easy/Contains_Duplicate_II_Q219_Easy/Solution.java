package Contains_Duplicate_II_Q219_Easy;
/*
 * Problem:
 * We need to determine if there are two equal elements in the array
 * such that their index difference is at most k.
 *
 * Approach (Brute Force with slight optimization):
 *
 * 1. Use two nested loops to check every pair (i, j)
 * 2. Fix i and look forward only (j = i + 1 ... n)
 *    - This avoids duplicate checking and self comparison
 *
 * 3. For each pair:
 *    - Check if values are equal → nums[i] == nums[j]
 *    - Check if index distance is within limit → |i - j| <= k
 *
 * 4. If both conditions are satisfied, return true immediately
 *
 * Optimization:
 * - Since j > i, distance is (j - i)
 * - If (j - i) becomes greater than k, we can break early
 *   because further j will only increase the distance
 *
 * Complexity:
 * - Worst case: O(n * k) (better than O(n^2) due to early break)
 */
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }

                // optional optimization: no need to go further if distance already > k
                if (j - i > k) {
                    break;
                }
            }
        }

        return false;
    }

}
