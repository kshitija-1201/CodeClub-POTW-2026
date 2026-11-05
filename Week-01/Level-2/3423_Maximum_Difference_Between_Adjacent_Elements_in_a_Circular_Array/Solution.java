```java
/*
 * Problem No.: 3423
 * Problem Name: Maximum Difference Between Adjacent Elements in a Circular Array
 * Level: 2
 *
 * Problem Statement:
 * Given a circular array, find the maximum absolute difference
 * between every element and its next adjacent element.
 *
 * Approach:
 * Traverse the array and use modulo (%) to find the next index.
 * This also connects the last element back to the first element.
 */

class Solution {
    public int maxAdjacentDistance(int[] nums) {

        int y;
        int max = 0;
        int i = 0;

        while (i < nums.length) {

            // Find the next index, including circular connection.
            int next = (i + 1) % nums.length;

            // Calculate absolute difference.
            y = Math.abs(nums[i] - nums[next]);

            if (y > max) {
                max = y;
            }

            i++;
        }

        return max;
    }
}

// TC: O(n) - Traverses the array once.

// SC: O(1) - Uses constant extra space.
```