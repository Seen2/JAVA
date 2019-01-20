import java.util.Scanner;
public class DecisionControl{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in); //initialized Scanner
		System.out.println("Yes(y or Y)\nNo(n or N):");
		char response=s.next().charAt(0); //take input from user using Scanner

		if(response=='y' || response=='Y'){
			System.out.println("Yes.."); //printing output to user
		}
		else if(response=='n' || response=='N'){
			System.out.println("No.."); //printing output to user
		}
		else{
			System.out.println("Please, Try Again.."); //printing output to user
		}
	}
}
