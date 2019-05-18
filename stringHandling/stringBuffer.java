import java.util.*;

public class stringBuffer {
  public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // String str=sc.nextLine();
    String str = "Shintu";
    StringBuffer s = new StringBuffer(str);
    s.insert(0, "Tiwari ");
    System.out.println(s);
    System.out.println("capacity=" + s.capacity());

    // reverse word by word and then line
    s.reverse();
    System.out.println(s);
    System.out.println(s.reverse()); // returns refrence to main string
    // append at end of string

    s.append(" Tiwari");
    System.out.println(s);

    // capacity: total allocated capacity
    System.out.println("capacity=" + s.capacity());

    // ensureCapacity: inc. capacity of string
    s.ensureCapacity(25);
    System.out.println("capacity=" + s.capacity());
    char cS[] = new char[s.length()];
    Arrays.fill(cS, '$');

    /*
     * Parameters: This method takes four parameters:
     * 
     * srcBegin: int value represents index on which the copying is to be started.
     * srcEnd: int value represents index on which the copying is to be stopped.
     * dst: array of char represents the array to copy the data into. dstBegin: int
     * value represents index of dest array to start pasting the copied data.
     */
    s.getChars(1, s.length() - 1, cS, 1);

    System.out.println(cS);
    s.deleteCharAt(s.indexOf(" "));
    System.out.println(s);
    String ns = s.toString();
    System.out.println(ns instanceof String);
    // set character at any given index.
    s.setCharAt(2, '$');
    System.out.println(s);
    System.out.println(s.substring(2, 3));
    s.setLength(4);
    System.out.println(s);

    s.delete(0, s.length());
    System.out.println(s);
    char c = 'a';
    String ss = Character.toString(c);
    System.out.println(ss);
    ss = ss + " cc";
    System.out.println(ss);

    // s.del

  }
}