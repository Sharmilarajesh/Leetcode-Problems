/*
  3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

 import java.util.*;
 class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int count=0;
        int n=s.length();

        while(right<n){
            if(map.containsKey(s.charAt(right))){
                 left=Math.max(map.get(s.charAt(right))+1,left);
            }

            map.put(s.charAt(right),right);
            count=Math.max(count,right-left+1);
            right++;
        }
        return count;
        
    }
}