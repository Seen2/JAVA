import java.util.*;
import java.util.LinkedList;

public class ListExample{
	public static void main(String []args) {
		
		List list=new ArrayList();
		list.add(1);
		list.add("One");
		System.out.println(list);
		
		LinkedList<String> queue =new LinkedList<String>(); //Specific to string items
		queue.add("5");
		queue.addFirst("0");
		queue.addFirst("1");
		queue.addFirst("Zero");
		
		
		
		System.out.println(queue);
		
		queue.removeLast();
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);	
		System.out.println(queue.size());
		
				
	
}
	
}
