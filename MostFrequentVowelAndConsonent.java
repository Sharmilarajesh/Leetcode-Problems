/*
3541. Find Most Frequent Vowel and Consonant

You are given a string s consisting of lowercase English letters ('a' to 'z').

Your task is to:

Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
Find the consonant (all other letters excluding vowels) with the maximum frequency.
Return the sum of the two frequencies.

Note: If multiple vowels or consonants have the same maximum frequency,
 you may choose any one of them. If there are no vowels or no consonants 
 in the string, consider their frequency as 0.

The frequency of a letter x is the number of times it occurs in the string.
 

Example 1:

Input: s = "successes"

Output: 6

Explanation:

The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
The output is 2 + 4 = 6.
Example 2:

Input: s = "aeiaeia"

Output: 3

Explanation:

The vowels are: 'a' (frequency 3), 'e' ( frequency 2), 'i' (frequency 2). The maximum frequency is 3.
There are no consonants in s. Hence, maximum consonant frequency = 0.
The output is 3 + 0 = 3.
 */

import java.util.*;
 class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();

        int max1=0;
        int max2=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                if(!map1.containsKey(ch)){
                    map1.put(ch,1);
                }
                else{
                    map1.put(ch,map1.get(ch)+1);
                }
            }
            else{
                 if(!map2.containsKey(ch)){
                    map2.put(ch,1);
                }
                else{
                    map2.put(ch,map2.get(ch)+1);
                }

            }
        }
        if(!map1.isEmpty()){
            max1=Collections.max(map1.values());

        }
        if(!map2.isEmpty()){
            max2=Collections.max(map2.values());

        }
            

        return max1+max2;
        
        
    }
}