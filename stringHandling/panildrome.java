
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class panildrome {
  public static void main(String[] args) throws IOException {
    // code
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(in.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(in.readLine());
      StringBuffer str = new StringBuffer(in.readLine());
      String s = str.toString();
      str.reverse();
      String r = str.toString();
      System.out.println(s.equals(r) ? "Yes" : "No");
    }
  }
}