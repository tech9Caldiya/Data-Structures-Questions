class Solution {
    public int subtractProductAndSum(int n) {
        int s =0 ;
        int p = 1;
        int a;
        while(n !=0)
        {
            a = n%10;
            s = s+a;
            p = p*a;
            n= n/10;
        }
        
        int d= p-s;
      return d;  
    }
}

url : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
