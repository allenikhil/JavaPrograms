package javaexamples;

import java.util.Scanner;

public class FibonacciSeries 
{
public static void main(String[] args) {
	int n,t1=0,t2=1,s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many numbers u want to print");
	n=sc.nextInt();
	System.out.print("first"+n+"terms:");
	for(int i=1;i<=n;i++)
	{
		System.out.print(t1+"+");
		s=t1+t2;
		t1=t2;
		t2=s;
	}
}
}
