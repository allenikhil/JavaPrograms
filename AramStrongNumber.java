package javaexamples;

import java.util.Scanner;

public class AramStrongNumber 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int c=0,a,temp=num;
	while(num>0)
	{
		a=num%10;
		num=num/10;
		c=c+(a*a*a);
	}
	if(temp==c)
	{
		System.out.println("Aramstrong Number");
	}
	else
	{
		System.out.println("Not Aramstrong Number");
	}
}
}
