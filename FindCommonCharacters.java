/*
  1002. Find Common Characters

Given a string array words, return an array of all characters that show up 
in all strings within the words (including duplicates). You may return the answer in any order.

 

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 */

 import java.util.*;
 class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list=new ArrayList<>();
        int[] minFreqArray=new int[26];
        Arrays.fill(minFreqArray,Integer.MAX_VALUE);

        for(String word:words){
            int[] wordFreq=new int[26];
              
            for(char ch:word.toCharArray()){
                wordFreq[ch-'a']++;

            }
            for(int i=0;i<26;i++){
                minFreqArray[i]=Math.min(minFreqArray[i],wordFreq[i]);
            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<minFreqArray[i];j++){
                list.add(String.valueOf((char)(i+'a')));
            }
        }
        return list;

        
    }
}