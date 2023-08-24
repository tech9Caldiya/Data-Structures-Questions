class Solution {
    static void swap(int[] arr , int j , int i){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public void moveZeroes(int[] nums) {
        int count = 0;
        int n = nums.length;

        for(int k = 0 ; k<n ; k++){
            if(nums[k] == 0){
                count++;
            }
        }
        while(count --> 0 ){
            int i = 1;
            int j = i-1;
            while(i < n){
                if( nums[i] != 0 && nums[j] == 0){
                    swap(nums , j , i );
                }
                i++;
                j++;
            }
        }
    }        
}
