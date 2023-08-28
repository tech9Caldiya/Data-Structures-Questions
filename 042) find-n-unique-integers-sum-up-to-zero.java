class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int index = 0;

        if(n%2==0){
            ans[index++]=0;
        }
        n = n/2;
        for(int i = 1 ; i<=n ; i++)
        {
            ans[index++]=i;
            ans[index++]= -i;
        }
        return ans;
    }
}
