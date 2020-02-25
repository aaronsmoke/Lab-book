package com.cpg.lab3.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	int a[]=new int[s];
	void getValues() {
	for(int i=0;i<s;i++)
	{
		a[i]=sc.nextInt();
	}
	}
	int findSmallest()
	{
		Arrays.sort(a);
		return a[1];
	}

}
