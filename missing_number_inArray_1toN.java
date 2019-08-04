/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG<type> {
	public static void main (String[] args) {
			Scanner in=new Scanner(System.in);
		int test = in.nextInt();
		int N;
		int sumN,sumA;
	    for(int i=0;i<test;i++)
	    {
	        N = in.nextInt();
	        sumN = (N*(N+1)/2);
	        sumA=0;
	        int[] arr = new int[N-1];
	        for(int j=0;j<N-1;j++)
	        {
	            arr[j]=in.nextInt();
	            sumA += arr[j];
	        }
	        
	        System.out.println(sumN-sumA); //expected sum of N integer(N*(N-1)/2) - actual sum = missing number
	    }
	}
}