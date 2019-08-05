import java.io.*;

public class write {
  public static void main(String[] args) {
    byte c[] = { 'S', 'h', 'i', 'n', 't', 'u','\n' };
    String s="Tiwari\n";
    try {
      FileOutputStream w = new FileOutputStream("test.txt");
      BufferedOutputStream wb=new BufferedOutputStream(w);
      wb.write(c);
      wb.write(s.getBytes());
      wb.close();
      w.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}