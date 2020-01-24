//import java.util.function.Counsumer;

interface functionalInterface{
	void display(int t);
}

public class main {

	public static void main(String []args){

		functionalInterface f=(t)->System.out.println("Hello,world"+t);
		f.display(3);
		

	}
}
