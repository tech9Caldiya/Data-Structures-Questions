class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0 ;
        
        for( List<String> list : items)   // here list<String> is a datatype  and items is our arraylist
        {
                if(ruleKey.equals("type") && ruleValue.equals(list.get(0))) //comparison of strings -> .equals() not ==
                {
                    count++;
                }
                else if(ruleKey.equals("color") && ruleValue.equals(list.get(1))) // get() method to access a value in arraylist 
                {
                    count++;
                }
                else if(ruleKey.equals("name") && ruleValue.equals(list.get(2)))
                {
                    count++;
                }
         }
         return count;
        }
       
}  

        //now the above approach is using arraylist but we can even use 2-d array approach here applying the if else conditions
        // by just initialising column here
        //for example if ruleKey == "type" then column =0; and so on for rest conditions
        //then traverse through the arraylist
        //for(int i =0 ; i<items.size() ;i++ ){
        //if(items[i][column] ==ruleValue){
        // ans++;
        // }





url : https://leetcode.com/problems/count-items-matching-a-rule/
