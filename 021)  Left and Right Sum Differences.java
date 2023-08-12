import java.lang.Math;
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int [] leftSum = new int[n];
        int [] rightSum = new int[n];
        //leftSum
        for(int i = 1 ; i<n ; i++)
        {
            leftSum[0] = 0;
            leftSum[i] = leftSum[i-1] + nums[i-1];
        
        }
        // rightSum
        for(int i = n-2 ; i>=0 ; i--)
        {
            rightSum[n-1]= 0;
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        //difference array
        for(int i = 0 ; i<n ; i++)
        {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
        
    }
}

URL : https://leetcode.com/problems/left-and-right-sum-differences/
