
package Sum_of_Square_Numbers_Q633_Medium;

class Solution {
    public boolean judgeSquareSum(int c) {

        /*
         * Thinking Process:
         *
         * 1. We need to determine if there exist integers a and b such that:
         *        a^2 + b^2 = c
         *
         * 2. Instead of trying every possible pair (a, b), we fix one variable (a)
         *    and compute what the other must be.
         *
         * 3. For each possible value of a:
         *        remaining = c - a^2
         *
         *    Now the problem reduces to:
         *        Is remaining a perfect square?
         *
         * 4. If remaining is a perfect square, then there exists an integer b such that:
         *        b^2 = remaining
         *
         * 5. To check this efficiently, we compute:
         *        b = sqrt(remaining)
         *    and verify:
         *        b * b == remaining
         *
         * 6. We iterate a only until a^2 <= c because beyond that,
         *    a^2 would exceed c and remaining becomes negative.
         *
         * 7. We use long instead of int to avoid integer overflow when computing a^2.
         *
         * 8. If any valid pair is found, return true immediately.
         *    If no such pair exists after all possibilities, return false.
         */


        for (long a = 0; a * a <= c; a++) {

            long remaining = c - a * a;

            long b = (long) Math.sqrt(remaining);

            if (b * b == remaining) {
                return true;
            }
        }

        return false;
    }

}