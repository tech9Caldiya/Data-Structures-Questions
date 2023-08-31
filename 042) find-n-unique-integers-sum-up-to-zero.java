class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int mid = n/2 +1;
        int i = 1;
    
        int start = 0;
        int end = ans.length-1;
        while(start<end){
        if(n%2 != 0)
        {
            ans[mid] = 0;
        }
        ans[start] = i;
        ans[end] = -i;
        i++;
        start++;
        end--;
            
        }
        return ans;
        
    }
}
