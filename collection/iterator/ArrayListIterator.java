import java.util.*;

public class ArrayListIterator{

	public static void main(String []args){
		ArrayList arr=new ArrayList();
		arr.add("Hello");
		arr.add(2.3f);
		arr.add(1.23);
		arr.add(true);
		arr.add(1);
		arr.add('A');

		//to iterate in list filled with more than one datatype and avoid type mismatch

		Iterator iobj=arr.iterator();

		while(iobj.hasNext()) {
			System.out.println(iobj.next());

		}

		// using enhanced forEach loop and lambda expression
		arr.forEach(e->System.out.println(e));
	}
}
