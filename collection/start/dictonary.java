import java.util.*;
// import java.io.*;

class dictonary {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] t = s.split(" ");
		System.out.println(t[0]);
		Map<String, String> dict = new HashMap<String, String>();
		dict.put("key", "value");
		System.out.println(dict);
		System.out.println(dict.keySet());
		System.out.println(dict.get("key"));
		dict.put("0-key", "0-value");
		dict.put("1-key", "1-value");
		dict.put("2-key", "2-value");
		dict.put("3-key", "3-value");
		dict.put("4-key", "4-value");
		System.out.println(dict);
		dict.remove("2-key");
		System.out.println(dict);
		dict.replace("key", "value", "Value");
		System.out.println(dict.isEmpty());
		System.out.println(dict);
		dict.clear();
		System.out.println(dict);
		System.out.println(dict.isEmpty());

	}
}
