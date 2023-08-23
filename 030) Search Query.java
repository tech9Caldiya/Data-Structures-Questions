package psaUsingArrays;
import java.util.*;
//an array is given. We have search an element x in the array . This query will be asked q times.
//Hint : It is given that all elements in array are less than 10 to the power 5

//concept of frequency array will be used
public class SearchQuery {
    static int[] makeFreqArray(int[] arr){
        int[] freq = new int[100005];
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
         int[] freq =  makeFreqArray(arr);
        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();
        while(q>0){
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
    }

}
