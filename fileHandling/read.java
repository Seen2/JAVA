import java.io.*;

public class read {
  public static void main(String[] args) {
    // char c[] = { 'S', 'h', 'i', 'n', 't', 'u' };
    try {
      FileInputStream r = new FileInputStream("test.txt");
      int c;
      while ((c = r.read()) != -1) {
        System.out.print((char) c);
      }
      System.out.println("");
      r.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}