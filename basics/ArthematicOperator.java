import java.util.Scanner;
public class ArthematicOperator{

	public static void main(String args[]){
		
		Scanner s= new Scanner(System.in); //initialized Scanner
		System.out.println("X:");
		int x=s.nextInt();
		System.out.println("Y:");
		int y=s.nextInt();
		System.out.println("X+Y:"+(x+y));
		System.out.println("X-Y:"+(x-y));
		System.out.println("X*Y:"+(x*y));
		System.out.println("X/Y:"+(x/y));
		System.out.println("X%Y:"+(x%y));
		
		System.out.println("Incrementation and Decrementation");
		System.out.println("Now, x="+x);
		System.out.println("x++="+x++);
		System.out.println("Now, x="+x);
		System.out.println("x--="+x--);
		System.out.println("Now, x="+x);
		System.out.println("++x="+(++x));
		System.out.println("Now, x="+x);
		System.out.println("--x="+--x);
		System.out.println("Now, x="+x);

	}
}
