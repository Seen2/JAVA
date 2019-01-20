import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Pencil p1=new Pencil();
		Pencil p2=new Pencil();
		//p1.price=0.5f;
		
		p1.length=5;
		p2.length=4;
		
		p1.setColor("red");
		String color=p1.getColor();
		System.out.println(color);
		p2.setColor("blue");
		color=p2.getColor();
		System.out.println(color);
		
		Pen pen1= new Pen();
		Scanner in=new Scanner(System.in);
		color=in.next();
		pen1.setColor(color);
		System.out.println(pen1.getColor());
		
	}
}
