/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int test = in.nextInt();
		int N,S,k;
		int sum;
	    for(int i=0;i<test;i++)
	    {
	        N = in.nextInt();
	        S = in.nextInt();
	        int[] arr = new int[N];
	        for(int j=0;j<N;j++)
	        {
	            arr[j]=in.nextInt();
	        }
	        sum=0;
	        k=0;
	        for(int j=0;j<N;j++){
	            sum += arr[j];
	            while(sum>S && k<=j){
	                sum -= arr[k];
	                k++;
	            }
	            if(sum==S){
	                System.out.println((k+1)+" "+(j+1));
	                break;
	            }
	            if(j==N-1){
	                System.out.println("-1");
	            }
	        }
	    }
	}
}