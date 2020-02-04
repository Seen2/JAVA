import java.util.*;

public class ArraysUtility{
	public static void main(String []args){
		int []num={1,2,3,4,5,6,7,8,0,8,9};
		int copyNum[]=Arrays.copyOf(num,3);

		for(int ele:copyNum) System.out.print(ele);
		System.out.println("");
		int extraCopyNum[]=Arrays.copyOf(num,23);
		for(int ele:extraCopyNum) System.out.print(ele);
		System.out.println("");
		Arrays.sort(num);
		for(int ele:num) System.out.print(ele);
		System.out.println("");

	}
}
