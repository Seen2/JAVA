import java.util.*;
import java.io.*;
import java.lang.*;
class Armstrong{
	public static void main(String args[]){
		int n=args[0].length(),num=Integer.parseInt(args[0]);
		char arr[]=args[0].toCharArray();
		int sum=0;
		for(char c:arr){
			sum+=Math.pow(Character.getNumericValue(c),n);
		}
		if(sum==num){
			System.out.println("Yes "+num+" is Armstrong number");
		}else{
			System.out.println("Yes "+num+" ain't Armstrong number");
		}
	}
}
