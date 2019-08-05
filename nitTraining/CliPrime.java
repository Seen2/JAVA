import java.util.*;
import java.lang.*;
import java.io.*;

public class CliPrime {
	public static void main(String args[]) {
		int a = new Integer(args[0]), b = Integer.parseInt(args[1]);
		// System.out.println(a);
		// System.out.println(b);

		for (int i = a; i <= b; i++) {
			if (isPrime(i) == 1) {
				System.out.println(i);
			}
		}
	}

	static int isPrime(int n) {
		if (n < 2) {
			return 0;
		}
		for (int i = 2; i < (n / 2) + 1; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
