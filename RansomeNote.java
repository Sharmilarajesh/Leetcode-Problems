/*
 383. Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote 
can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.


Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

 import java.util.*;

 class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
           HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : ransomNote.toCharArray()) {
            if (!letterCount.containsKey(ch) || letterCount.get(ch) == 0) {
                return false;
            }
            letterCount.put(ch, letterCount.get(ch) - 1);
        }

        return true;
    }
    
}