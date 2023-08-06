class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
       for(int i=0;i< candies.length;i++)
       {
          if(candies[i]>max)  max= candies[i];
       }
        List<Boolean> ans = new ArrayList<>();
        for(int j=0; j<candies.length;j++ )
        {
            if(candies[j] + extraCandies >= max) {
               ans.add(true);
            }  
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}

url: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
