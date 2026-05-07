
package Find_Numbers_with_Even_Number_of_Digits_Q1295_Easy;

/*
 Traverse through each number in the array.
 Convert the number into a string to easily count digits.
 Find the length of the string.
 Check whether the digit count is even using length % 2 == 0.
 If it is even, increment the result counter.
 Finally, return the total count of numbers with even digits.
*/
class Solution {
    public int findNumbers(int[] nums) {

        int n = nums.length;

        int result = 0;

        for(int i=0;i<n;i++){

            String s = String.valueOf(nums[i]);

            int length = s.length();

            if(length %2 == 0){

                result++;

            }

        }

        return result;

    }
}