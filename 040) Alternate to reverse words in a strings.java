import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder Str = new StringBuilder( words.length);

        for(int i = words.length-1 ; i>=0 ; i--)
        {
            if( words[i].length() != 0) //checking if word is not an empty string
            {
                if(Str.length() != 0)  // this is for the "The returned string should only have a single space separating the words" condition.
                {
                    Str.append(" ");
                }
                Str.append( words[i]);
            }
        }

        return Str.toString();
     
    }
}
