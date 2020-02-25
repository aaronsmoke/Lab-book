package Lab1;

import java.util.Scanner;

public class exercise4 {
	public boolean checkNumber(int n) {
		double a, b;
		a = n;
		b = 1;
		for (int i = 0; i < n / 2 + 1; i++) {

			if (a == b)
				return true;
			b = b * 2;
		}
		return false;
	}

	public static void main(String[] args) {
		exercise4 e4 = new exercise4();
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		System.out.println("The result is " + e4.checkNumber(sc.nextInt()));
		sc.close();

	}
}
