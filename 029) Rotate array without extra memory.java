package psaUsingArrays;
import java.util.*;

public class RotateWithoutUsingExtraSpace {

    static void swapElement(int [] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void Reverse(int[] arr , int start , int end)
  {
        while(start<=end){
            swapElement(arr , start ,end);
            start++;
            end--;
        }
    }
    static void RotateInPlace(int[] arr , int k){
        int n = arr.length;
        k = k%n;
        Reverse(arr , 0 , n-1-k);
        Reverse(arr , n-k, n-1);
        Reverse(arr , 0 , n-1);
    }

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("give array elements: ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("k steps to rotate the array : ");
        int k = sc.nextInt();

        System.out.println("original array : ");
        PrintArray(arr);
        RotateInPlace(arr,k);
        System.out.println();
        System.out.println("rotated array without taking extra memory : ");
        PrintArray(arr);

    }
}
