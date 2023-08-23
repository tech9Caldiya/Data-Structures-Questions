package psaUsingArrays;

import java.util.Scanner;

public class SortZeroesAlternateApproach {

    static void Swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    static void Sortby0sand1s(int[] arr){
        int i = 0 , j = arr.length - 1;
        while( i < j )
        {
            if(arr[i] == 1 && arr[j] == 0){
                Swap(arr , i , j);
                i++;
                j--;
            }
            if(arr[i] == 0 )
            {
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
    }
    static void PrintArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
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
        System.out.println("Original Array is : ");
        PrintArray(arr);
        Sortby0sand1s(arr);
        System.out.println();
        System.out.println("Sorted array is : ");
        PrintArray(arr);
    }
}
