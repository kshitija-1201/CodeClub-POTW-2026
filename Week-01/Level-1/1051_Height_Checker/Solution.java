/*
LeetCode 1051: Height Checker
Level: 1

Problem:
Find the number of students whose positions differ
from their positions in the sorted heights array.

Approach:
1. Copy the original heights array into expected.
2. Sort the heights array using optimized Bubble Sort.
3. Compare both arrays element by element.
4. Increment count whenever corresponding elements differ.
5. Return the count.

TC: O(n²) - Bubble Sort takes O(n²) in the worst case.
SC: O(n) - An additional array of size n is created.
*/

class Solution {
    public int heightChecker(int[] heights) {

        int count = 0;
        int k = heights.length;

        // Copying the original heights array into expected
        int[] expected = new int[k];

        for(int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        // Sorting heights using optimized Bubble Sort
        for(int i = 0; i < heights.length; i++) {

            boolean swapped = false;

            for(int j = 0; j < heights.length - 1 - i; j++) {

                if(heights[j] > heights[j + 1]) {

                    int temp = heights[j + 1];
                    heights[j + 1] = heights[j];
                    heights[j] = temp;

                    swapped = true;
                }
            }

            if(swapped == false) {
                break;
            }
        }

        // Comparing both arrays
        for(int m = 0; m < heights.length; m++) {

            if(heights[m] != expected[m]) {
                count = count + 1;
            }
        }

        return count;
    }
}