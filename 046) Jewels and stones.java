class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        // String[] arr = jewels.split("");
        // String[] brr = stones.split("");

        // for(int i = 0 ; i<arr.length ; i++){
        //     for(int j = 0 ; j<brr.length ; j++){
        //         if( arr[i].equals(brr[j]) ){
        //             count++;
        //         }
        //     }
        // }
        // return count;

       for(char mn : jewels.toCharArray()){
           for(char ch : stones.toCharArray() ){
               if( mn == ch){
                   count++;
               }
           }
       }
       return count;

    }
}
