import java.util.*;

public class _HashMap{
	public static void main(String []args){

		//unsorted => order is unprdictable
		Map dict=new HashMap();
		dict.put("key","value");
		dict.put(1,"one");
		dict.put(2,"one");
		//value at 2 will updated to Two
		dict.put(2,"Two");
		dict.put("k","one");
		dict.put("Two","2");
		System.out.println(dict);
		dict.remove("Two");
		System.out.println(dict);
		Set set=dict.entrySet();
		System.out.println(set);
		set=dict.keySet();
		System.out.println(set);
		Collection c=dict.values();
		System.out.println(c);
		Object obj=dict.get("key");
		System.out.println(obj);
		//sorted => order is prdictable

	}
}
