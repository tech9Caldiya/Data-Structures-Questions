import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb = new StringBuilder();
       s = s.toLowerCase();
       for(int i = 0 ; i<s.length() ; i++){
           if(Character.isLetterOrDigit(s.charAt(i)))
           {
               sb.append(s.charAt(i));
           } 
       }
       int n = sb.length()-1;
       for(int i = 0 ; i < sb.length()/2 ; i++){
           if(sb.charAt(i) != sb.charAt(n-i)) return false;
       }
       return true;

        
    }
}
