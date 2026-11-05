import java.util.Arrays;

/*
LeetCode 2300: Successful Pairs of Spells and Potions
Level: 1

Problem:
For each spell, count the number of potions whose product
with that spell is greater than or equal to success.

APPROACH 1: BRUTE FORCE

1. Traverse each spell.
2. Check it with every potion.
3. If their product >= success, increment count.
4. Store the count in the pairs array.

TC: O(n * m) - Nested loops check every spell-potion pair.
SC: O(n) - Result array of size n.
*/


class Solution {

    // Brute Force Approach
    public int[] successfulPairsBruteForce(int[] spells, int[] potions, long success) {

        int[] pairs = new int[spells.length];
        int count;

        for(int i = 0; i < spells.length; i++) {

            count = 0;

            for(int j = 0; j < potions.length; j++) {

                // Typecasting prevents integer overflow.
                if((long) spells[i] * potions[j] >= success) {
                    count++;
                }
            }

            pairs[i] = count;
        }

        return pairs;
    }


    /*
    APPROACH 2: OPTIMIZED (SORTING + BINARY SEARCH)

    1. Sort the potions array in ascending order.
    2. For each spell, use Binary Search to find the
       first potion that forms a successful pair.
    3. All potions from that index to the end are successful.
    4. Calculate the count using m - index.

    TC: O(m log m + n log m)
    SC: O(n + log m) - Result array and sorting stack space.
    */

    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int n = spells.length;
        int m = potions.length;

        int[] pairs = new int[n];

        Arrays.sort(potions);

        for(int i = 0; i < n; i++) {

            int low = 0;
            int high = m - 1;
            int index = m;

            while(low <= high) {

                int mid = low + (high - low) / 2;

                if((long) spells[i] * potions[mid] >= success) {
                    index = mid;
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            pairs[i] = m - index;
        }

        return pairs;
    }
}