
package Number_of_Segments_in_a_String_Q434_Easy;

/*
This method counts the number of words (segments) in a given string.

Steps:
1. Remove leading and trailing spaces using trim()
   - This ensures extra spaces at the start/end do not affect the count.

2. Check if the string becomes empty after trimming
   - If empty, return 0 because there are no words.

3. Split the string using "\\s+"
   - This regex matches one or more whitespace characters.
   - It correctly handles multiple spaces between words.

4. The number of words is the length of the resulting array
   - Return words.length as the final count.
*/

class Solution {
    public int countSegments(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        String[] words = s.split("\\s+");
        return words.length;
    }
}