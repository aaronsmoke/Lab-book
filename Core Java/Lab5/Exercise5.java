package lab5;

import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String m) {
		super(m);
	}
}
public class Exercise5 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int a=sc.nextInt();
		if(a<15)
			throw new AgeException("Age of person should be above 15");
		else
			System.out.println("Valid age");
	}

}
