/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0){
		    
	    int n = sc.nextInt();    
		long[] arr = new long[n];
		long ans = 0;
		for(int i = 0 ; i< n ; i++ )
		{
		    arr[i] = sc.nextInt();
		}
		for(int i = 1 ; i< n ; i++)
		{
		    if(arr[i] != arr[i-1])
		    {
		        ans += Math.abs(arr[i] - arr[i-1] );
		    }
		    else
		    continue;
		}
		System.out.println(ans-n+1);
    	}
    }
}
url : https://www.codechef.com/problems/CHEFSTR1

