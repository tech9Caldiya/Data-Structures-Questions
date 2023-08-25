class Solution {
    static boolean isPalindrome(String S){
            int i = 0 ;
            int j = S.length()-1;
            while(i<j){
                if(S.charAt(i) != S.charAt(j)){
                    return false;
                }
                else
                {
                    i++;
                    j--;
                }   
    }
    return true;
}   
    public int countSubstrings(String s) {
        
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            for(int j = i+1 ; j<=s.length() ; j++)
            {
                if( isPalindrome(s.substring(i,j) ))
                {

                    count++;

                }

            }
        }
        return count;
    } 
}
