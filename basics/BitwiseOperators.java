import java.util.Scanner;

public class BitwiseOperators{

	public static void main(String args[]){
		
		Scanner s= new Scanner(System.in); //initialized Scanner
		System.out.print("x:");
		int x=s.nextInt();
		System.out.print("y:");
		int y=s.nextInt();

		System.out.println("Bitwise Operations:");

		System.out.print("x:");
		printBinary(x);
		System.out.print("y:");
		printBinary(y);
		System.out.print("~x:");
		printBinary(~x);
		System.out.print("~y:");
		printBinary(~y);
		System.out.print("x:");
		printBinary(x);
		System.out.print("y:");
		printBinary(y);
		System.out.print("x & y:");
		printBinary(x&y);
		System.out.print("x:");
		printBinary(x);
		System.out.print("y:");
		printBinary(y);
		System.out.print("x | y:");
		printBinary(x|y);
		System.out.print("x:");
		printBinary(x);
		System.out.print("y:");
		printBinary(y);
		System.out.print("x >> y:");
		printBinary(x>>y);
		System.out.print("x:");
		printBinary(x);
		System.out.print("y:");
		printBinary(y);
		System.out.print("x << y:");
		printBinary(x<<y);
		System.out.print("x:");
		printBinary(x);
		System.out.print("y:");
		printBinary(y);
		System.out.print("x >>> y:");
		printBinary((x>>>y)); //shifted place value will be filled with zero and shifting is of x by y number of bits
		

	}
	private static void printBinary(int x){
		x=Integer.parseInt(Integer.toString(x,2));//coverting integer to binary(=2) radix string and then to Integer
		System.out.println("="+x);
	
	}
}
