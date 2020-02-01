import java.util.*;

public class _Stack{


	//example of list:
	public static void main(String []args){
		Stack s=new Stack();
		s.push("Hello");
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.search(3));
	}
}
