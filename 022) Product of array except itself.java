class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        int lp[] = new int[nums.length];
        int rp[] = new int[nums.length];
        int a = 1;
        int b = 1;
        answer[0] = 1;
        //left produt
        for(int i = 1 ; i<nums.length ; i++)
        {
            a = a*nums[i-1]; 
            answer[i] = a;
        }
        //right product
        for(int j = nums.length-1 ; j>=0 ; j--)
        {
            answer[j] = b * answer[j];
            b = nums[j] * b;
        }
        }
        return answer;
        }
