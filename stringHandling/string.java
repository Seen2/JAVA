import java.util.Scanner;

public class string {

  public static void main(String[] args) {
    // char s[] = { '1', 'a', '@' };

    // for (int i = 0; i < 3; i++) {
    // System.out.println(s[i]);
    // }
    // System.out.println(s);

    Scanner sc = new Scanner(System.in);

    // Character input
    char c = sc.next().charAt(0);

    // Print the read value
    System.out.println("c = " + c);
  }
}