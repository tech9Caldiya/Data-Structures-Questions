class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 1 || n ==0){
            return ;
        }
        int nz = 0 , z = 0;
//diya please pay attention to nz greater to and less than signs !!!!!
        while(nz < n){
            if(nums[nz] != 0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            }
    
            else{
                nz++;
            }
        }
    }
     
}
