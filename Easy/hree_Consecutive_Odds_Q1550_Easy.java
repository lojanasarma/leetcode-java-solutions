
package Three_Consecutive_Odds_Q1550_Easy;

/*
We cannot access index -1 or index n (out of bounds).

So instead of starting from index 0, we iterate from index 1 to n - 2.

At any index i:
- arr[i - 1] → previous element
- arr[i]     → current element
- arr[i + 1] → next element

This way, we safely check three consecutive elements without going out of bounds.
*/
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int n = arr.length;

        boolean result = false;

        for(int i=1;i<(n-1);i++){

            int previous = arr[i-1];
            int current = arr[i];
            int next = arr[i+1];

            if((previous%2 != 0) && (current%2 != 0) && (next%2 != 0)){

                result = true;

            }

        }

        return result;

    }
}