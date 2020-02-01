import java.util.*;

public class _ArrayList{
	public static void main(String []args){
		List list =new ArrayList();
		List <Integer> li=new ArrayList<Integer>();
		list.add("Hello");
		list.add(1);
		list.add(false);

		System.out.println(list);
		System.out.println(list.get(1));
		List l =new ArrayList();
		l.add(23);
		l.add("Something");


		list.add(1,l);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(l);
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}
