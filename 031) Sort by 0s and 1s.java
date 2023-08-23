package psaUsingArrays;
import java.util.*;

public class SortZeroesAndOnes {
    static void Sortby0sand1s(int[] arr){
        int count =0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i = 0 ; i< arr.length ; i++){
            if(i<count){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
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

