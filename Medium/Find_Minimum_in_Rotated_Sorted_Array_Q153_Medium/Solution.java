
package Find_Minimum_in_Rotated_Sorted_Array_Q153_Medium;

/*
Thinking Process:

1. Assume the first element is the minimum.
2. Traverse the array from the second element.
3. Compare each element with the current minimum.
4. If a smaller element is found, update the minimum.
5. Continue until the end of the array.
6. Return the minimum value.

In the question, they asked to find the minimum element
in a rotated sorted array using its rotation property.
But here, I used the normal linear search method
to find the minimum element in the array.

Time Complexity: O(n)
Because every element is checked once.
*/
class Solution {
    public int findMin(int[] nums) {

        int minimum = nums[0];

        for(int i=1;i<nums.length;i++){

            minimum = Math.min(nums[i],minimum);

        }

        return minimum;

    }
}