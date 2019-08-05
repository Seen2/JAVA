import java.io.*;

public class read {
  public static void main(String[] args) {
    // char c[] = { 'S', 'h', 'i', 'n', 't', 'u' };
    try {
      FileInputStream r = new FileInputStream("test.txt");
      BufferedInputStream rb=new BufferedInputStream(r);
      int c;
      while ((c = rb.read()) != -1) {
        System.out.print((char) c);
      }
      System.out.println("");
      rb.close();
      r.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}