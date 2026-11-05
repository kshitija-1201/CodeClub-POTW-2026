/*
LeetCode 258: Add Digits
Level: 0

Problem:
Repeatedly add the digits of a number until
a single-digit number is obtained.

Approach:
1. Use an outer loop until the number becomes
   a single digit.
2. Use an inner loop to extract and add digits.
3. Repeat until a single digit remains.

TC: O(log n) - Repeatedly processes the digits.
SC: O(1) - Uses constant extra space.
*/

class Solution {
    public int addDigits(int num) {

        while(num >= 10) {
            int ans = 0;

            while(num > 0) {
                int k = num % 10;
                ans = ans + k;
                num = num / 10;
            }

            num = ans;
        }

        return num;
    }
}