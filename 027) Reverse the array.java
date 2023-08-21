package psaUsingArrays;
import java.util.*;
import java.lang.*;

import java.util.Collections;

public class ReverseTheArray {
    static void ReverseTheArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){   // here it should be while not if while mein inc ya dec hota hai
            SwapElements(arr , i , j);
            i++;
            j--;
        }

    }
     static void SwapElements(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
     }
     static void PrintArray(int[] arr){
        for(int i = 0 ; i<arr.length ;i++ ){
            System.out.print(arr[i] +" ");
        }
     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        Integer[] arr = new Integer[n];
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
//        Arrays.sort(arr , Collections.reverseOrder());
        
        ReverseTheArray(arr);
//        System.out.println(Arrays.toString(arr));



    }
}
