/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void myshellsort(int[] x,int[] y){
        int xN= x.length,temp;
        int yN= y.length;
        int h = 1;
        while(h<(xN+yN)/3) h = 3*h+1;  // gap is 3size+1 //1,4,13,40
        
        while(h>=1){
            for(int i=h; i<(xN+yN);i++){
                for(int j=i; j>=h ;j-=h)
                {
                    if(j<xN){
                        if(!(x[j]<x[j-h]))
                            break;
                            else{
                                temp = x[j];  //do exchange
                                x[j] = x[j-h];
                                 x[j-h] = temp;
                            }
                    } else if((j-h <xN) && j>=xN){
                        if(!(y[j-xN]<x[j-h]))
                            break;
                        else{
                                temp = y[j-xN];  //do exchange
                                y[j-xN] = x[j-h];
                                 x[j-h] = temp;
                            }
                    } else {
                        if(!(y[j-xN]<y[j-xN-h]))
                            break;
                        else{
                                temp = y[j-xN];  //do exchange
                                y[j-xN] = y[j-xN-h];
                                 y[j-xN-h] = temp;
                            }
                    }
                }
            }
            h=h/3;
        }
    }
    public static void printall(int[] x){
        int xN= x.length;
        for(int i=0; i<xN;i++)
            System.out.print(x[i]+" ");
        System.out.println();    
    }
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int test = in.nextInt();
		int xN,yN;
	    for(int i=0;i<test;i++)
	    {
	        xN = in.nextInt();
	        yN = in.nextInt();
	        
	        int[] arrx = new int[xN];
	        int[] arry = new int[yN];
	        for(int j=0;j<xN;j++)
	        {
	            arrx[j]=in.nextInt();
	        }
	        for(int j=0;j<yN;j++)
	        {
	            arry[j]=in.nextInt();
	        }
	        myshellsort(arrx,arry);
	        printall(arrx);
	        printall(arry);
	    }
    }
}