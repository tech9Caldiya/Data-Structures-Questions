class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = num.length-1 ; i>=0 ; i--)
        {
            list.add( (num[i]+k) % 10);
            k = (num[i] + k)/10;
        }

        while(k>0)
        {
            list.add(k%10);
            k /=10;
        }
        // Collections.reverse(list);
        //return list;
         
         for(int i = list.size()-1; i >=0  ; i--)
        {
            int z = list.get(i);
            ans.add(z);

        }
     
        return ans;
        
    }
}

url :https://leetcode.com/problems/add-to-array-form-of-integer/
