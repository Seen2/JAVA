import java.util.Scanner;

public class charArray{

  public static void main(String[] args) {
    char c[] = new char[4];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      c[i] = sc.next().charAt(0);
    }
    System.out.println(c);

  }
}