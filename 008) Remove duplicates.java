class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length-1;i++)
        {
                if(nums[i]== nums[i+1])
                {
                   return true;
                }
        }
        return false;
    }
}
 tip : to reduce time complexity use less for loops.
url : https://leetcode.com/problems/contains-duplicate/
