import java.util.*;

public class userDefinedValidateIp {
  public static void main(String[] args) throws ArithmeticException, InvalidInputException {
    try {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      if (n > 100) {
        throw new InvalidInputException("Number is >100");
      } else {
        throw new ArithmeticException("valid Input");
      }
    } catch (InvalidInputException e) {
      System.out.println(e);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
  }
}

class InvalidInputException extends Exception {
  InvalidInputException(String txt) {
    super(txt);
  }
}