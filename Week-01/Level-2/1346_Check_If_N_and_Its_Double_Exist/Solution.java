```java
/*
 * Problem No.: 1346
 * Problem Name: Check If N and Its Double Exist
 * Level: 2
 *
 * Problem Statement:
 * Given an array, check whether there exist two different
 * indices i and j such that arr[i] == 2 * arr[j].
 *
 * Approach:
 * Use nested loops to compare every element with every
 * other element. If a matching pair is found, return true.
 */

class Solution {
    public boolean checkIfExist(int[] arr) {

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == 2 * arr[j]) {
                    flag = true;
                    return flag;
                }
            }
        }

        return flag;
    }
}

// TC: O(n²) – Nested loops compare every element with every other element.

// SC: O(1) – Only a constant extra variable (flag) is used.
```