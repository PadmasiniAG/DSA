import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void findtriplets(int[] arr){
        int size = arr.length,count=0;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size ; j++){
                for(int k=0; k<size; k++){
                    if(arr[i] + arr[j] == arr[k])
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        if(count!=0)
        System.out.println(count);
        else
        System.out.println("-1");
    }
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test>0)
		{
		    int N = in.nextInt();
		    int[] arr = new int[N];
		    for(int j=0; j<N ; j++){
		        arr[j]= in.nextInt();
		    }
		    findtriplets(arr);
		    test--;
		}
	}
}