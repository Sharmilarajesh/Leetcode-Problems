/*
 119. Pascal's Triangle II

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
 */
import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<=rowIndex;i++){
            List<Integer> li=new ArrayList<>();
            li.add(1);

            for(int j=1;j<i;j++){
                int sum=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                li.add(sum);
            }
            if(i>0){
                li.add(1);
            }
            list.add(li);
        }
        
        return list.get(rowIndex);
    }
}