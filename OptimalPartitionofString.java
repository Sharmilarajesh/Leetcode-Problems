/*
2405. Optimal Partition of String

Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

Return the minimum number of substrings in such a partition.

Note that each character should belong to exactly one substring in a partition.

 

Example 1:

Input: s = "abacaba"
Output: 4
Explanation:
Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
It can be shown that 4 is the minimum number of substrings needed.
Example 2:

Input: s = "ssssss"
Output: 6
Explanation:
The only valid partition is ("s","s","s","s","s","s").
 

Constraints:

1 <= s.length <= 105
s consists of only English lowercase letters.
 */

 class Solution {
    public int partitionString(String s) {
        boolean[] seen = new boolean[26];
        int count = 1; // at least one partition
        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) {
                // start a new substring
                count++;
                seen = new boolean[26]; // reset
            }
            seen[c - 'a'] = true;
        }
        return count;





    //     char[] ch = s.toCharArray();
    //     int minCount = Integer.MAX_VALUE;

    //     for(int i = 0; i < ch.length; i++){
    //         int count = 0;
    //         String str = "";
    //         for(int j = i; j < ch.length; j++){
    //             str = str + ch[j];
    //             if(isOptimal(str)){
    //                 count = count +1;
    //                 minCount = Math.min(count , minCount);

    //             }
    //         }
    //     }
    //     return minCount;
    // }       
    

    // public boolean isOptimal(String s){
    //     char[] ch = s.toCharArray();
    //     int[] hash = new int[26];
    //     for(int i = 0; i < 26; i++){
    //         hash[ch[i]-'a']++;
    //     }
    //     for(int i = 0; i < 26; i++){
    //         if(hash[i] > 1)  return false;
    //     }
    //     return true;
    }
}