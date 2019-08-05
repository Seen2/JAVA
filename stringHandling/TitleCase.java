
import java.util.*;
import java.lang.*;
import java.io.*;

public class TitleCase {
  public static void main(String[] args) throws IOException {
    // code
    BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
    int t = new Integer(ob.readLine());
    while (t-- > 0) {
      StringBuffer s = new StringBuffer(ob.readLine());
      char tmp = ' ';
      for (int i = 0; i < s.length(); i++) {
        if (tmp == ' ') {
          char c = s.charAt(i);
          int a = (c <= 'z' && c >= 'a') ? (int) c - 32 : c;
          s.setCharAt(i, (char) a);
        }
        tmp = s.charAt(i);
      }
      System.out.println(s);
    }

  }
}