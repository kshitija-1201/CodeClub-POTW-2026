/*
LeetCode 1518: Water Bottles
Level: 0

Problem:
Given the number of full water bottles and the exchange
rate, find the maximum number of bottles you can drink.

Approach:
1. Store the initial number of bottles in key.
2. Divide the available empty bottles by numExchange
   to calculate how many new bottles can be obtained.
3. Calculate the remaining empty bottles using modulus.
4. Repeat the process until no more exchanges are possible.
5. Add the initially available bottles and newly obtained
   bottles to get the final answer.

TC: O(log n) - The number of bottles decreases after
    each exchange iteration (for fixed numExchange > 1).

SC: O(1) - Uses constant extra space.
*/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int key = numBottles;
        int x, y;
        int sum = 0;

        while(numBottles >= numExchange) {
            x = numBottles / numExchange;
            y = numBottles % numExchange;

            numBottles = (x + y);

            sum = sum + x;
        }

        int finalans = key + sum;
        return finalans;
    }
}