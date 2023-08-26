class Solution {
    public String reverseWords(String s) {
     String result = new String(); 
        int i = 0 ;
        int n = s.length();
    
    while(i<n){

        while(i < n && s.charAt(i) == ' ') i++;
        if(i>=n) break;
        int j=i+1;
        while(j < n && s.charAt(j) != ' ') j++;
       String str =  s.substring(i , j); // not j-1 because in java i is inclusive and j is exclusive
       if(result.length() == 0 ) result = str;
       else{   
       result = str + " " + result;
      }
      i= j+1;
    } 
       return result;     
    }
}
