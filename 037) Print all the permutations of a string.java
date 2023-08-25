package psUsingStrings;
import java.util.*;
import java.lang.*;
import java.io.*;

public class PrintAllThePermutationsOfString {
    static void swap(char[] arr , int i , int fi){
        char temp = arr[i]; //char temp not int temp
        arr[i] = arr[fi];
        arr[fi] = temp;

    }
    static void permutations(char[] arr , int fi){
        if(fi == arr.length-1){
            System.out.println(arr);
            return;
        }
        for(int i = fi ; i<arr.length ; i++){
            swap(arr, i , fi);
            permutations(arr, fi +1);
            swap(arr , i , fi); //undo the swapping
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permutations(s.toCharArray() , 0 );

    }
}

