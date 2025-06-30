/*
  709. To Lower Case


Given a string s, return the string after replacing every uppercase letter 
with the same lowercase letter.

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
 
 */

 class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        String str="";

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                str+=(char) (ch+32);
            }
            else if(ch>=97 && ch<=122){
                str+=ch;
            }
            else{
                str+=ch;
            }
        }   
        return str;   
    }
}