import java.util.*;

public class SetExample {

	public static void main(String []args) {
		
		
		Set set=new HashSet();
		set.add(1);
		set.add(1);
		set.add("one");
		
		System.out.println(set);
		
		Set<String> st=new HashSet<String>();
		st.add("One");
		st.add("Two");
		st.add("Three");
		System.out.println(st);
		
		Set SortedSet=new TreeSet(st);
		System.out.println(SortedSet);
		
		
		Set<Integer> Integerst=new HashSet<Integer>();
		Integerst.add(1);
		Integerst.add(2);
//		Integerst.add("Three");
		System.out.println(Integerst);
		
		
		}

}
