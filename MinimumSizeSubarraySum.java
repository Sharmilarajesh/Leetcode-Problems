/*
 209. Minimum Size Subarray Sum

Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 
 */

 class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum = sum + nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right-left+1);
                sum = sum - nums[left];
                left = left + 1;

            }
        }
        if (minLen == Integer.MAX_VALUE)
            return 0;
        else
            return minLen;

        // int len=0;
        // int minLen=Integer.MAX_VALUE;

        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum=sum+nums[j];
        //         if(sum>=target){
        //             len=j-i+1;
        //             minLen=Math.min(len,minLen);
        //         }
        //     }
        // }
        // if(minLen==Integer.MAX_VALUE)  return 0;
        // else return minLen;

    }
}