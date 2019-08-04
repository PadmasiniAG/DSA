/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test>0){
		    String s=sc.next();
		    String sd[]=s.split("\\.");   //direct . will match with everything so use \\. -- its an exception
		   
		    for(int i=sd.length-1;i>=0;i--){
		        if(i==0){
		            System.out.print(sd[i]);
		        }
		        else
		        System.out.print(sd[i]+".");
		    }
		    System.out.println();
		    
		    
		    test--;
		}
	}
}
