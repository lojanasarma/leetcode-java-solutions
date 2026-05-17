
package Jump_Game_III_Q1306_Medium;

/*
Approach:
- Treat each index as a node in a graph.
- From a given index, we can move either:
    1. start + arr[start]
    2. start - arr[start]

Base Conditions:
- If index goes out of bounds, return false.
- If the index is already visited, return false.
- If arr[start] == 0, return true because target is reached.

Visited Handling:
- Mark visited indices by converting their values to negative.
- This avoids infinite loops caused by revisiting the same index.

Recursive DFS:
- Store current jump value before marking visited.
- Recursively explore both forward and backward jumps.
- If either recursive call returns true, then reaching 0 is possible.

Complexity:
- Time Complexity: O(n)
- Space Complexity: O(n) due to recursion stack
*/

class Solution {

    public boolean canReach(int[] arr, int start) {

        if (start < 0 || start >= arr.length || arr[start] < 0) {
            return false;
        }

        if (arr[start] == 0) {
            return true;
        }

        int jump = arr[start];
        arr[start] = -arr[start];

        return canReach(arr, start + jump) ||
                canReach(arr, start - jump);
    }
}