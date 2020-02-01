//can be of two type HashSet =>order unpredictable
//And LinkedHashSet  =>ordered in sequence of insertion

import java.util.*;

public class _Set{

	//HashSet =>order unpredictable
	public static void main(String []args){
		Set s=new HashSet();
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.add(1);
		s.add("Hello");
		s.add(3.4f);
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.remove(1);
		System.out.println(s);
		//LinkedHashSet  =>ordered in sequence of insertion
		Set ss=new LinkedHashSet();
		System.out.println(ss);
		System.out.println(ss.isEmpty());
		ss.add(1);
		ss.add("Hello");
		ss.add(3.4f);
		System.out.println(ss);
		System.out.println(ss.isEmpty());
		ss.remove(1);
		System.out.println(ss);
		//SortedSet =>ordered in sequence of insertion
		SortedSet sortedSet=new TreeSet();
		sortedSet.add(1);
		sortedSet.add(2);
		sortedSet.add(4);
		//first lowest work with similar data type
		System.out.println(sortedSet.first());
		//last highest work with similar data type
		System.out.println(sortedSet.last());

	}
}
