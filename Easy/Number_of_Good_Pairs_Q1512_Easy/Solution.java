
package Number_of_Good_Pairs_Q1512_Easy;

/*
    - Determine the size of the input array.
    - Initialize a counter to keep track of valid (good) pairs.

    - Use two nested loops to compare every possible pair of elements:
        • The outer loop selects the first element.
        • The inner loop selects the second element.

    - For each pair (i, j), check:
        • If the values are equal (nums[i] == nums[j]).
        • If the index i is less than j to avoid:
            - Counting the same pair twice.
            - Comparing an element with itself.

    - If both conditions are satisfied, increment the pair counter.

    - After checking all pairs, return the total count.
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {

        int n = nums.length;

        int pairs = 0;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                if(nums[i] == nums[j] && (i < j) ){

                    pairs++;

                }

            }

        }

        return pairs;

    }
}