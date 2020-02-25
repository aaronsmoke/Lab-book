package Lab7;

import java.util.Arrays;

public class Excercise7 {
static int[] getSorted(int a[])
{
	int b,c,d;
	for(int i=0;i<a.length;i++)
	{
		b=a[i];
		c=0;
		while(b!=0)
		{
			c=c*10+b%10;
			b=b/10;
		}
		a[i]=c;
	}
	Arrays.sort(a);
	
	return a;
}
public static void main(String[] args) {
	int a[]= {123,124,125,126,345};
	for(int i:Excercise7.getSorted(a))
	System.out.println(i+" ");
}
}
