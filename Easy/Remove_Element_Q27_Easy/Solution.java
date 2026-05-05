
package Remove_Element_Q27_Easy;

        /*
        Approach:
        - We iterate through the array once.
        - Use a pointer `k` to track the position where the next valid element (not equal to val) should go.
        - For each element:
            - If it is NOT equal to val, we place it at index `k`.
            - Then increment `k` to move to the next position.
        - Elements equal to `val` are skipped.
        - At the end, the first `k` elements of the array contain the filtered result.
        - Return `k` as the new length of the array without `val`.
        */

class Solution {
    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int k = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i]; // keep valid elements
                k++;
            }

        }

        return k;
    }
}