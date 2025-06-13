/*
  1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 */

 import java.util.*;
 class Solution {
    public boolean checkIfPangram(String sentence) {

        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();

        for(int i='a';i<='z';i++){
            list.add(i);
        }

        for(int c:sentence.toCharArray()){
            list1.add(c);
        }
        for(int i=0;i<list.size();i++){
            if(!list1.contains(list.get(i))){
                return false;
            }
        }
        return true;
        
    }
}