
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class index {
  public static void main(String[] args) {
    // code
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    while (t > 0) {
      int n = in.nextInt(), d = in.nextInt();
      boolean flag = false;
      String dig = Integer.toString(d);
      for (int i = 0; i <= n; i++) {
        String tmp = Integer.toString(i);

        if (tmp.contains(dig)) {
          System.out.print(i + " ");
          flag = true;
        }
      }

      if (!flag) {
        System.out.println("-1");
      } else {
        System.out.println("");
      }
      t--;
    }
  }
}