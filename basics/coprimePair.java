/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int ar[]={4,8,3,9},c=0;
		for(int i=0;i<ar.length;i++){
		    for(int j=i+1;j<ar.length;j++){
		        if(isCoprime(ar[i],ar[j])==1){
		            System.out.println(ar[i]+","+ar[j]);
		            c++;
		        }
		        
		    }
		}
		System.out.println(c);
	}
	public static int isCoprime(int a,int b){
	    int n=(a>b)?a:b;
	    for(int i=2;i<n;i++){
	        if(a%i==0 && b%i==0){
	            return 0;
	        }
	    }
	    return 1;
	}
}
