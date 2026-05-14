package Sort_Colors_Q75_Medium;
/*
 * Thinking Process:
 * 1. I remembered the sorting algorithm I studied in my DSA Java module (Y1S2).
 * 2. Since the array only needs to be arranged in sorted order,
 *    I decided to use the Insertion Sort algorithm.
 * 3. Insertion Sort works by taking one element at a time
 *    and placing it in its correct position among the already sorted elements.
 * 4. I started from index 1 because a single element at index 0
 *    is already considered sorted.
 * 5. For each element:
 *      - Store the current value as 'key'
 *      - Compare it with previous elements
 *      - Shift larger elements one step to the right
 *      - Insert the key into the correct position
 * 6. After all iterations, the array becomes sorted in ascending order.
 */
class Solution {
    
    public void sortColors(int[] nums) {

        for(int j = 1; j < nums.length; j++) {

            int key = nums[j];
            int i = j - 1;

            // Move elements greater than key one position ahead
            while(i >= 0 && nums[i] > key) {

                nums[i + 1] = nums[i];
                i = i - 1;

            }

            nums[i + 1] = key;

        }

    }
}