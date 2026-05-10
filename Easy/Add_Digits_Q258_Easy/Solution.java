
package Add_Digits_Q258_Easy;

/*
Goal:
Keep adding all digits of the number until only a single digit remains.

Example:
num = 38
3 + 8 = 11
1 + 1 = 2
Answer = 2

Thinking Process:

1. We need to repeat the operation until the number becomes a single digit.
   A single digit means num < 10.

2. Use a while loop:
   while(num >= 10)
   because numbers with 2 or more digits still need processing.

3. Inside the loop:
   Convert the number into a String so we can access each digit easily.

4. Convert the String into a char array:
   This allows iterating through every character (digit).

5. Create a variable 'result' to store the sum of digits.

6. Traverse each character:
   array[i] gives characters like '3', '8', etc.

7. Convert character digit to integer:
   array[i] - '0'
   Example:
   '5' - '0' = 5

8. Add each digit to result.

9. After the loop finishes,
   result contains the sum of all digits.

10. Assign:
    num = result
    so the process can repeat if result still has multiple digits.

11. Once num becomes a single digit,
    exit the while loop and return num.

Time Complexity:
Each iteration processes all digits of the number.
Approximately O(log n)

Space Complexity:
O(log n) because of String and char array creation.
*/
class Solution {
    public int addDigits(int num) {

        while (num >= 10) {

            String s = Integer.toString(num);

            char[] array = s.toCharArray();

            int result = 0;

            for (int i = 0; i < array.length; i++) {

                result = result + (array[i] - '0');

            }

            num = result;
        }

        return num;
    }
}