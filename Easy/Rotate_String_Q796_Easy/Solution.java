
package Rotate_String_Q796_Easy;

/*
    Problem: Check if goal is a rotation of string s.

    Key Idea:
    A rotated string means we take some prefix of s and move it to the end.
    Example:
        s = "abcde"
        rotations:
        "abcde", "bcdea", "cdeab", "deabc", "eabcd"

    Insight:
    Instead of generating all rotations manually, we can use a trick:

        Any rotation of string s will always be a substring of (s + s)

    Why?
        If we double the string:
            s + s = "abcdeabcde"

        Every possible rotation appears as a continuous substring inside it.

    So:
        If goal is a rotation of s → goal must be found inside (s + s)

    Steps:
        1. If lengths differ → return false (cannot be rotation)
        2. If s equals goal → return true (no rotation needed)
        3. Otherwise:
            - Create doubled string = s + s
            - Check if doubled contains goal
            - If yes → return true
            - Else → return false

    Core Trick Learned:
        String doubled = s + s;
        doubled.contains(goal) is enough to detect rotation.
*/

class Solution {
    public boolean rotateString(String s, String goal) {

        boolean result = false;

        //First I'm gonna check the lengths of the Strings are Equal
        int n1 = s.length();
        int n2 = goal.length();

        if(n1 != n2){

            result = false;

        }else if(s.equals(goal)){

            result = true;

        }else{

            //The goal should be a sub string of s+s
            String doubled = s+s;

            if(doubled.contains(goal)){

                result = true;

            }

        }

        return result;

    }
}
