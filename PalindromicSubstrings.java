/*
  

647. Palindromic Substrings

Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

 

Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */

 class Solution {
    public int countSubstrings(String s) {
        char[] chArr=s.toCharArray();
        int count =0;

        for(int i=0;i<chArr.length;i++){
            String str="";
            for(int j=i;j<chArr.length;j++){
                str+=chArr[j];  
                if(isPalindrome(str)){
                    count=count+1;

                }            
            }
        }
        return count;
    }
        public boolean isPalindrome(String str){
            char[] arr= str.toCharArray();
            int left = 0;
            int right = arr.length-1;
            while(left<right){
                if(arr[left]!=arr[right]) {
                    return false;
                } 
                left++;
                right--;
            }
            return true;
        }
        
    
}