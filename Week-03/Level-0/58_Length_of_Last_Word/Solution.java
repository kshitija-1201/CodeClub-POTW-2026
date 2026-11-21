/*
LeetCode 58: Length of Last Word
Level: 0

Problem:
Given a string containing words and spaces, find
the length of the last word in the string.

Approach:
1. Initialize a count variable to 0.
2. Traverse the string from right to left.
3. If the current character is not a space,
   increment the count.
4. If a space is encountered after counting characters,
   break the loop because the last word is completed.
5. Return the count.

TC: O(n) - Traverses the string at most once.

SC: O(1) - Uses constant extra space.
*/

class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--) {

            if(s.charAt(i) != ' ') {
                count++;
            }
            else if(count > 0) {
                break;
            }
        }

        return count;
    }
}