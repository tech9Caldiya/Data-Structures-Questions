class Solution {
    public int[] decompressRLElist(int[] nums) {
        //make an arraylist
        ArrayList<Integer> ans = new ArrayList<>();

        //iterate array for pairs(frequency , value)
        for(int i = 1 ; i<nums.length ; i+=2){
            int freq = nums[i-1];
            int val = nums[i];

        //repeat value of 'val' for 'freq' times to add to arraylist
            for(int j = 0 ; j<freq ; j++){
                ans.add(val);
            }
        }
        //convert arraylist to an integer array
        int[] result = new int[ans.size()];
        for(int i = 0 ; i<ans.size() ; i++){
            result[i] = ans.get(i);
        }
        return result;
        
    }
}
url:https://leetcode.com/problems/decompress-run-length-encoded-list
