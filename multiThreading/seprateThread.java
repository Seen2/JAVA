
class Printer {
  public void printDocs(String name, int copppies) {
    for (int i = 0; i < copppies; i++) {
      System.out.println(i + "-->" + name);
    }
  }
}

class App implements Runnable {

  public void run() {
    Printer p = new Printer();
    p.printDocs("jhonDoc", 10);
  }
}

public class seprateThread {
  public static void main(String[] args) {
    System.out.println("-->starts");
    Thread a = new Thread(new App());
    a.start();
    System.out.println("-->Finished");

  }
}
