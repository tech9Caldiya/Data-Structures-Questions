class Solution {
    public int finalValueAfterOperations(String[] opp) {
        int X = 0 ;
        for(int i = 0 ; i<opp.length ; i++)
        {
            if("X--".equals(opp[i]) ||
             "--X".equals(opp[i]))
            {
                X = X - 1;
            }
            if("X++".equals(opp[i]) ||
            "++X".equals(opp[i]))
            {
                X = X + 1;
            }
        }
        return X;
        
    }
}
url : https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
