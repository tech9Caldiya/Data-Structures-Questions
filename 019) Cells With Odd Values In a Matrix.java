class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
       for(int i = 0 ; i<indices.length ; i++)
{
           int p = indices[i][0];
           int q = indices[i][1];

        //for rows
        for(int k = 0 ; k< n ; k++)
        {
            ans[p][k] += 1;

        }
        //for columns
        for(int k = 0 ; k<m ; k++)
        {
            ans[k][q] += 1;

        }
}
        int count = 0;
        for(int[] arr : ans)
        {
            for(int num  : arr)
            {
                if( num%2 == 1)
                count++;
            }
        }
        return count;
        
    }
}


url :https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
