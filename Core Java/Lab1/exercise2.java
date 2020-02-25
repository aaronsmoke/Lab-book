package Lab1;

import java.util.Scanner;

public class exercise2 {
	public int calculateDifference(int n) {
		int sumOfSquare = 0 , sum = 0;
		for(int i=1; i<n+1;i++) {
			sumOfSquare = sumOfSquare + i*i;
			sum = sum +i; 
		}
		return sumOfSquare-(sum*sum);
	}
	public static void main(String[] args) {
		exercise2 e2 = new exercise2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		System.out.println("The result is "+e2.calculateDifference(sc.nextInt()));
		sc.close();
	}
}
