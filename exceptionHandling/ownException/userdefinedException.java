
class MyException extends Exception {
  public int n;

  MyException(int n) {
    this.n = n;
  }

  public String toString() {
    return ("exception number=" + this.n);
  }
}

public class userdefinedException {
  public static void main(String[] args) {

    try {
      throw new MyException(4);
    } catch (MyException e) {
      System.out.println(e);
    }

  }
}
