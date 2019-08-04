/**
                               
Problems
Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.

Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}  

Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20} 
Input:
First line contains an integer T, denoting the number of test cases. First line of each test case contains two space separated integers X and Y, denoting the size of the two sorted arrays. Second line of each test case contains X space separated integers, denoting the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q.

Output:
For each test case, print (X + Y) space separated integer representing the merged array.

Constraints:
1 <= T <= 100
1 <= X, Y <= 5*104
0 <= arr1i, arr2i <= 109

Example:
Input:
2
4 5
1 3 5 7
0 2 6 8 9
2 3
10 12
5 18 20

Output:
0 1 2 3 5 6 7 8 9
5 10 12 18 20

Explanation:
Testcase 1: After merging two non-decreasing arrays, we have, 0 1 2 3 5 6 7 8 9.

 

** For More Input/Output Examples Use 'Expected Output' option **
Author: shubham54
 
Test against custom input

If you have purchased any course from GeeksforGeeks then please ask your doubt on course discussion forum. You will get quick replies from GFG Moderators there.



Need help with your code? Please use ide.geeksforgeeks.org, generate link and share the link here. 

Weekly
Monthly
Overall
the_coder95	937
themanhasnoname	236
butter	229
RishabhTanwar1	188
BuboHowler	151
PadmasiniReshu	5




 
If you are facing any issue on this page. Please let us know.

×
 Hint 1
 Hint 2
 Hint 3
 Full Solution
C++
Java
//package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    public static int nextGap(int gap) { 
        if(gap <= 1) return 0; 
        return (gap / 2) + (gap % 2); 
    }
    
    public static void merge(int arr1[], int arr2[], int n, int m) {
        int i, j, gap = n + m, tmp;
        for(gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            for(i = 0; i + gap < n; i++){
                if(arr1[i] > arr1[i + gap]){
                    tmp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i+gap] = tmp;
                }
            }
            
            for(j = gap > n ? gap-n : 0 ; i < n&&j < m; i++, j++){
                if(arr1[i] > arr2[j]){
                    tmp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = tmp;
                }
            }
            
            if(j < m) {
                for (j = 0; j + gap < m; j++){
                    if(arr2[j] > arr2[j + gap]){
                        tmp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = tmp;
                    }
                }
            }
        }
    } 

    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int arr1[] = new int[n];
		    int arr2[] = new int[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Integer.parseInt(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
