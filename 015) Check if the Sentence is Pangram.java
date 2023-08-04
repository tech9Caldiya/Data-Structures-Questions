class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans[] = new boolean[26]; // new boolean 
        boolean check = false;

        // we are making a boolean array named ans and
        //now we will be updating values of this new array to 'true' based on the character we get from input
        // then we will traverse the boolean array if we have any false present this means that it is not a pangram

        for(int i = 0; i<sentence.length() ; i++)
        {
            ans[ sentence.charAt(i)-97] = true; //every character will be placed in bool array using charAt() method in form of true or false.
        }
        for(int j = 0 ; j< ans.length ; j++) // j not i! 
        {
            if(ans[j] == false)
            {
                return false;
            }
        }
        return true ;
    }
 }

url : https://leetcode.com/problems/check-if-the-sentence-is-pangram/
