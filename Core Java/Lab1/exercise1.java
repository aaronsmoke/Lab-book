package Lab1;

import java.util.Scanner;

public class exercise1 {
	public int calculateSum(int n) {
		int sum=0;
			for (int i = 0; i < n+1; i++) {
				if(i%3==0||i%5==0) {
					sum=sum+i;
				}
			
		}
			return sum;
	}
	public static void main(String[] args) {
		exercise1 e1 = new exercise1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		System.out.println("The result is "+e1.calculateSum(sc.nextInt()));
		sc.close();
	}
}
