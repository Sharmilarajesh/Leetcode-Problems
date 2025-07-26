/*
  
238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 */

 class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int result[] = new int[n];

        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=nums[i+1]*suffix[i+1];
        }
        for(int i=0;i<n;i++){
            result[i]=prefix[i]*suffix[i];
        }
        return result;

        // int n = nums.length;
        // int result[] = new int[n];
       
        // for(int i=0;i<n;i++){
        //     int num = nums[i];
        //     int product=1;
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             product=product*nums[j];
                    
        //         }
        //         result[i]=product;
                
        //     }
        // } 
        // return result;       
    }
}