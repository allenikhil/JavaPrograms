package javaexamples;

import java.util.Scanner;//not completed

public class MaximumOccurenceOfCharacter
{
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		String s1=sc.next();
		String s2=s1.toUpperCase();
	   int arr[]=new int[95];
	   int maxIndex=0;
	   int charecter = 0;
	   for(int index=0;index<=s2.length()-1;index++)
		{
			char ch=s2.charAt(index);
			int ascii=ch;
			arr[ascii]++;
		}
	   for(int a:arr)
	   {
		   System.out.println(a);
	   }
	   
	}
}
