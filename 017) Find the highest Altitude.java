class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n+1];
        int m = alt.length;
        alt[0] = 0;
        alt[1] = gain[0];
        for(int i =2 ; i< m ; i++)
        {
            alt[i] = alt[i-1] + gain[i-1];
        }
        int max = alt[0];
        for(int i = 0 ;i<n+1 ;i++)
        {
             max = Math.max( max , alt[i]);

        }
        return max;
    }
}

https://leetcode.com/problems/find-the-highest-altitude/
