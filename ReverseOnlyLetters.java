/*
  917. Reverse Only Letters

Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

 
Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */

 class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chArr=s.toCharArray();
        int n=chArr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            if(!Character.isLetter(chArr[left])) {
                left++;
                }
            else if(!Character.isLetter(chArr[right])){
                right--;
            }
            else{        
                char temp=chArr[left];
                chArr[left]=chArr[right];
                chArr[right]=temp;
                left++;
                right--;
        }
            }
        
        return new String(chArr);
       
    }
}