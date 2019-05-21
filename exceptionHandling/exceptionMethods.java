public class exceptionMethods {
  public static void main(String[] args) {
    // methods
    // 1 try
    // 2 catch
    // 3 finally
    // 4 throw
    // 5 throws

    // 1 try
    try {
      // code
      int a = 23, b = 0;
      System.out.println("result=" + (a / b));
    } catch (Exception e) {
      // code
      System.out.println(e);

    }

    // nested try catch
    try {
      // code
      try {

      } catch (Exception e) {
        // code
      }
      try {

      } catch (Exception e) {
        // code
      }
    } catch (Exception e) {
      // code

    }

    // 2 catch
    try {
      // code
      int a = 23, b = 0;
      System.out.println("result=" + (a / b));
    } catch (Exception e) {
      // code
      System.out.println(e);

    }

    // multiple catch
    try {
      // code
      int a = 23, b = 0, c[] = new int[3];
      c[5] = b;
      System.out.println("result=" + (a / b));
    } catch (ArithmeticException e) {
      // code
      System.out.println(e);

    } catch (Exception e) {
      System.out.println(e);

    }
    // 3 finally
    // ==> it always excuted
    try {
      // code
      int a = 23, b = 0;
      System.out.println("result=" + (a / b));
    } catch (Exception e) {
      // code
      System.out.println(e);

    } finally {
      // it will ecuted wvwen if we remove catch block
      System.out.println("finally always executed");
    }
    // 4 throw
    
    // 5 throws

  }
}