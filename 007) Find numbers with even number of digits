class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        int num = 0;
        int count = 0;
        for(int i = 0 ; i< nums.length ; i++)
        {
            count = 0;
            while(nums[i] !=0 )
            {
                nums[i] = nums[i]/10;
                count++;
            }
            num = count;
            if(num %2 ==0)
            {
                ans++;
            }
        }
        return ans;
        
    }
}

url : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
