package javaexamples;	
import java.util.*;
public class ReverseLetters
{
	public static void main(String[] args)
			{
			      Scanner s=new Scanner(System.in);
				  System.out.println("enter words that u want to revers");
			      String str=s.nextLine();
			      System.out.println("Reverse the words is :");
			      String a[]=str.split(" ");
			         for(int i=a.length-1;i>=0;i--)
						{
							String s1=a[i];
							for(int j=s1.length()-1;j>=0;j--)
							{
		                       System.out.print(s1.charAt(j));
							}
							System.out.print(" ");
						
						}
	        }
}
