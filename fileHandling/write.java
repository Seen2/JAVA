import java.io.*;

public class write {
  public static void main(String[] args) {
    char c[] = { 'S', 'h', 'i', 'n', 't', 'u' };
    try {
      FileOutputStream w = new FileOutputStream("test.txt");
      for (char s : c) {
        w.write(s);
      }
      w.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}