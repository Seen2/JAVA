import java.util.Scanner;

public class stringClass {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    // built in methods

    // Length of string

    System.out.println(s.length());
    // // cahrecter at any given index
    // int i = sc.nextInt();
    // try {
    // System.out.println(s.charAt(i));

    // } catch (Exception a) {
    // System.out.println(a);
    // }
    // // index of character
    // char c = sc.next().charAt(0);
    // try {
    // System.out.println(s.indexOf(c, 0));

    // } catch (Exception a) {
    // System.out.println(a);
    // }
    // conversion to Upper case
    System.out.println(s.toUpperCase());
    // conversion to Lower case
    System.out.println(s.toLowerCase());
    String as = "shintu";
    // equality (boolean return)

    // case sensetive
    System.out.println(s.equals(as));
    // ignore case
    System.out.println(s.equalsIgnoreCase(as));

    // convert string to char Array
    char[] cA = s.toCharArray();
    // System.out.println(cA);
    for (int i = 0; i < s.length(); i++) {
      System.out.println(cA[i]);
    }
    // substring of string
    String ns = s.substring(3, s.length());
    System.out.println(ns);
    // triming: removes leading or ending white spaces
    System.out.println(s.trim());

    // not known
    System.out.println(String.valueOf(3));

  }
}