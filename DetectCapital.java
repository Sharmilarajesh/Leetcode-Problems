/*
  

520. Detect Capital

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
 */

 class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount=0;

        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capitalCount++;
            }
        }

        if(capitalCount==0){
            return true;
        }
        else if(capitalCount==word.length()){
            return true;
        }
        else if(capitalCount==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        else{
            return false;
        }
               
    }
}