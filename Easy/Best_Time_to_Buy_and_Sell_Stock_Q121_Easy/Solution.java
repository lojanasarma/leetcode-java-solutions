package Best_Time_to_Buy_and_Sell_Stock_Q121_Easy;

/*
    Total number of days in the prices array.
*/

/*
    minimum stores the lowest stock price
    seen so far while traversing the array.

    Initially, the first day's price is considered
    the minimum because it is the only price seen.
*/

/*
    answer stores the maximum profit found so far.

    Initially set to 0 because
    no transaction means no profit.
*/

/*
    Start traversing from index 1
    because index 0 is already used
    as the initial minimum price.
*/

/*
    Thinking Process:

    Assume we sell the stock today.

    To get maximum profit,
    we should buy the stock at the
    lowest price seen before today.

    So the profit for today becomes:

    today's price - minimum price seen so far
*/

/*
    Compare the current profit with
    the best profit found so far.

    Store the larger value in answer.
*/

/*
    Update the minimum price seen so far.

    This helps future days calculate
    larger profits if a lower buying
    price is found.

    The update happens after profit calculation
    to ensure buying happens before selling.
*/

/*
    Finally, return the maximum profit obtained.
*/

class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int minimum = prices[0];
        int answer = 0;

        for(int i = 1; i < n; i++) {

            // selling today
            int profit = prices[i] - minimum;

            answer = Math.max(answer, profit);

            // update minimum after checking profit
            minimum = Math.min(minimum, prices[i]);
        }

        return answer;
    }
}