/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t > 0){
		    int n = sc.nextInt();
		    int sum = sc.nextInt();
		    int i = 0, j;
		    int a[] = new int[n];
		    int rem;
		    
		    while(i < n) a[i++] = sc.nextInt();
		    for( i = 0; i < n-1; i++){
		        rem = sum - a[i];
		        for( j = i+1; j < n; j++){
		            if( rem == a[j] )
		            j = n;
		        }
		        if( j == n+1){
		            System.out.println("Yes");
		            i = n;
		        }
		    }
		    if(i != n+1)
		        System.out.println("No");
		    
		    t--;
		}
	}
}