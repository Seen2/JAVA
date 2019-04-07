import java.util.*;

public class ExceptionExample {

  public static void main(String[] args) {
    double x = 0.0;
    try {
      System.out.print("Enter a no:");
      Scanner in = new Scanner(System.in);
      x = in.nextDouble();
      System.out.println("reciprocal of " + x + "\tis : " + 1 / x);
    } catch (ArithmeticException e) {
      System.out.println("Can't devide by zero");
    } catch (InputMismatchException e) {
      System.out.println("Please enter valid number");
    } finally {
      System.out.println("YOu have entered " + ((x == 0.0) ? "Something wrong" : x));
    }
  }
}