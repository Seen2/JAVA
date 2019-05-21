//use if throw 

public class throwingException {
  public static void main(String[] args) {
    try {
      throw new ArithmeticException("Throw an exception");
    } catch (ArithmeticException e) {
      System.out.println("catched:" + e);
    }
    try {
      avg();
    } catch (ArithmeticException e) {
      System.out.println("catched:" + e);
    }
    try {
      Avg();
    } catch (ArithmeticException e) {
      System.out.println("catched:" + e);
    }
  }

  public static void avg() {
    throw new ArithmeticException("in avg");
  }

  public static void Avg() throws ArithmeticException {
    throw new ArithmeticException("in Avg");
  }

}
