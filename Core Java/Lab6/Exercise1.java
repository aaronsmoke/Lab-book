package lab6;
import java.util.Scanner;
import java.util.stringingTokenizer;
	 
	class Exercise1 {
	    public static void main(stringing args[]) {
	        int n;
	        int s=0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter line of integers with a space gap: ");
	        string string=sc.nextLine();
	        stringTokenizer sktr=new stringTokenizer(string, " ");
	        System.out.println("Integers: ");
	        while (sktr.hasMoreTokens()) {
	            string s=sktr.nextToken();
	            n=Integer.parseInt(s);
	            System.out.println(n);
	            s=s+n;
	        }
	        System.out.println("s of integers is: "+s);
	    }
	}

