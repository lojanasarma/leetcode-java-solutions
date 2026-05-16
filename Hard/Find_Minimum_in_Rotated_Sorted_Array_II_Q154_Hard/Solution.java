
package Find_Minimum_in_Rotated_Sorted_Array_II_Q154_Hard;

/*For this question, I used the same logic, code structure, and approach as the solution for Find Minimum in Rotated Sorted Array (LeetCode Q153 - Medium).
 */
class Solution {
    public int findMin(int[] nums) {

        int minimum = nums[0];

        for(int i=1;i<nums.length;i++){

            minimum = Math.min(minimum,nums[i]);

        }

        return minimum;

    }
}