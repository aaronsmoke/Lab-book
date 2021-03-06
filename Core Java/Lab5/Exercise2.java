package lab5;

import java.util.Scanner;

public class Exercise2 {

	public static int Fibonacci(int num) {
		if(num==1)
			return 1;
		if(num==2)
			return 1;
		else
			 return (Fibonacci(num-1)+Fibonacci(num-2));
		
	}
	
	public static int IterativeFibo(int num) {
		
		int i,f3=0;
		int f1=1,f2=1;
		for(i=1;i<n-1;i++){
	   		f3=f1+f2;
		   f1=f2;
		   f2=f3;
		}
		
		return f3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int p=num;
		int f3=IterativeFibo(n);
		System.out.println("Iterative nth value is "+f3);
		int fibo=Fibonacci(p);
		System.out.println("Recursively nth value of fibonacci is "+fibo);
		
	}

}
