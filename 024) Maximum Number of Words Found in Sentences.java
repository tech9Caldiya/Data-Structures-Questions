import java.lang.Math;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int max = 0;
        // char ch = ' ';
        for(int i = 0 ; i< sentences.length ; i++)
        {
            count = 1;
            for(int j = 0 ; j<sentences[i].length() ; j++){
            if(sentences[i].charAt(j) == ' ')
            {
                count++;
            }   
        }
            
        max = Math.max(count , max);
            
    }
        // count ++;
        return max;   
    }
}
url: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
