class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = nums;
        int[] ans = new int[nums.length] ;
        for(int i = 0 ; i<arr.length ; i++)
        {
            ans[i] = nums[nums[i]] ;
        }  
        return ans;
    }
}

url : https://leetcode.com/problems/build-array-from-permutation/
