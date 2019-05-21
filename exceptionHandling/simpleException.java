// built-in Exception
// 1 ArithmeticException
// 2 ArrayIndexOutOfBoundException
// 3 ClassNotfoundException
// 4 IOException
// 5 InterruptedException
// 6 NoSuchFieldException
// 7 NoSuchMethodException
// 8 NumberFormatException
// 9 RunimeException
// 10 StringIndexOutOfBoundException

public class simpleException {
  public static void main(String[] args) {
    try {
      // code
      int a = 23, b = 0;
      System.out.println("result=" + (a / b));
    } catch (Exception e) {
      // code
      System.out.println(e);

    }
    try {
      int n = Integer.parseInt("Shintu");
      System.out.println(n);
    } catch (NumberFormatException e) {
      System.out.println(e);
    }
    try {
      int[] a = new int[5];
      System.out.println(a[7]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
  }
}
