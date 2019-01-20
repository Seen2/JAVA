import java.util.Scanner;
public class hello{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in); //initialized Scanner
		System.out.println("What is your name?");
		String name=s.nextLine(); //take input from user using Scanner
		System.out.println("hello, "+name); //printing output to user
	}
}
