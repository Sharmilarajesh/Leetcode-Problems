/*

415. Add Strings

Given two non-negative integers, num1 and num2 represented as string, 
return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling 
large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"
 */

 class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();

        while(i>=0 || j>=0 || carry!=0){
            int digit1=0;
            int digit2=0;

            if(i>=0){
                digit1=num1.charAt(i)-'0';             
            }
            if(j>=0){
                digit2=num2.charAt(j)-'0';
            }
            int sum=digit1+digit2+carry;
            sb.append(sum%10);
            carry=sum/10;
            i--;
            j--;

        }
        return sb.reverse().toString();
        
    }
}