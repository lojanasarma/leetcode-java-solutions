
package Separate_the_Digits_in_an_Array_Q2553_Easy;

/*
Thinking Process:

1. Create a temporary result array large enough to store all digits.

2. Use 'count' to track the current position in the result array.

3. Traverse each number in the nums array.

4. For each number:

   - If the number contains only one digit:
     directly store it into result.

   - Otherwise:
     convert the number into a String so each digit
     can be accessed easily one by one.

5. Traverse each character in the String:

   - Extract each digit using charAt(j)
   - Convert character digit to integer using:
         s.charAt(j) - '0'
   - Store the digit into result array.
   - Increment count.

6. After processing all numbers,
   result array may still contain unused spaces.

7. Create a new array 'ans' with exact size = count.

8. Copy only the valid digits from result into ans.

9. Return ans as the final separated digits array.
*/

class Solution {
    public int[] separateDigits(int[] nums) {

        int[] result = new int[10000];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];

            if (temp < 10) {

                result[count] = temp;
                count++;

            } else {

                String s = Integer.toString(temp);

                for (int j = 0; j < s.length(); j++) {

                    result[count] = s.charAt(j) - '0';
                    count++;

                }
            }
        }

        // create final array with correct size
        int[] ans = new int[count];

        for (int i = 0; i < count; i++) {
            ans[i] = result[i];
        }

        return ans;
    }
}