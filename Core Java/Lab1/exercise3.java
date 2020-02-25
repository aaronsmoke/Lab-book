package Lab1;

import java.util.Scanner;

public class exercise3 {
	public boolean checkNumber(int n) {
		int modN, divN,  mod2N;
		divN = n;
		modN = divN % 10;
		divN = divN / 10;
		mod2N = modN;
		while (divN > 0) {
			modN = divN % 10;
			if (mod2N <modN)
				break;
			mod2N = modN;
			divN = divN / 10;
		}
		if (divN == 0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		exercise3 e3 = new exercise3();
		System.out.println("Enter the number to check");
		Scanner sc = new Scanner(System.in);
		System.out.println("The result is " + e3.checkNumber(sc.nextInt()));

	}

}
