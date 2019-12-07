package VirtusaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String 1");
	String x=sc.next();
	System.out.println("Enter a String 2");
	String y=sc.next();
	
	char ch1[]=x.toCharArray();
	char ch2[]=y.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	String s1=new String(ch1);
	String s2=new String(ch2);
	
	if(s1.equals(s2))
	{
		System.out.println("Two Strings are permutation each other");
	}
	else
	{
		System.out.println("There is no permutation in between two strings ");
	}
}
}
