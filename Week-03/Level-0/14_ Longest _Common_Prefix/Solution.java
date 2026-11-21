/*
LeetCode 14: Longest Common Prefix
Level: 0

Problem:
Given an array of strings, find the longest common
prefix shared by all the strings.

Approach:
1. Consider the first string as the reference string.
2. Use the outer loop to check each character position
   of the first string.
3. Use the inner loop to compare that character with
   the corresponding character of every other string.
4. If a string ends or characters do not match,
   return the substring from index 0 to i.
5. If all characters match, return the first string.

TC: O(n * m) - Checks characters of all strings,
    where n is the number of strings and m is the
    length of the shortest string.

SC: O(1) - Uses constant extra space.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        for(int i = 0; i < strs[0].length(); i++) {

            for(int j = 1; j < strs.length; j++) {

                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}