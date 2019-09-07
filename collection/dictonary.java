import java.util.*;
import java.io.*;

class dictonary {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		Map<String, String> dict = new HashMap<String, String>();
		dict.put("key", "value");
		System.out.println(dict);
		System.out.println(dict.keySet());
		System.out.println(dict.get("key"));
	}
}
