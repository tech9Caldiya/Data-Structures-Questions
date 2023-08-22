package psaUsingArrays;
import java.util.*;
import java.lang.*;

public class rotateAnArrayByKsteps {

    static int[] RotateArray(int[] arr , int k){
        int n = arr.length ;
        int[] ans = new int[n]; //creating an answer array
        k = k%n; // this is for finding no of rotations when k becomes greator than n
        int j = 0;
        //two loops will be run separately on answer array
      
        //for first part of array after rotation
        for(int i = n-k ; i<n ; i++){
            ans[j++] = arr[i]; //putting values of given array in answer array
        }
      
        //for second part of array
        for(int i = 0 ; i< n-k ; i++){
            ans[j++] = arr[i];
        }
         return ans;
    }
     static void PrintArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){;
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter k steps by which you want to rotate the array");
        int k = sc.nextInt();
        int[] ans = RotateArray(arr,k);
        System.out.println("Rotated array is :  " ) ;
        PrintArray(ans);
    }
}
