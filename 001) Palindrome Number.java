class solution {
    public boolean isPalindrome(int x) 
    {
        String a , b = "";
        a = Integer.toString(x);
        for(int i =a.length()-1;i>=0;i--)
        {
            b = b+ a.charAt(i);

        }
        if(a.equals(b))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}      

url : https://leetcode.com/problems/palindrome-number/
