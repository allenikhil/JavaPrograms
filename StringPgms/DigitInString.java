package StringPgms;

import java.util.Scanner;

public class DigitInString
{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String s1=sc.nextLine();
	int num=Integer.parseInt(s1);
	if(num>0)
	{
		System.out.println(num);
	}
	else
	{
		System.out.println(s1);
	}
}
}
