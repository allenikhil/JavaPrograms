package javaexamples;

import java.util.Scanner;

public class StringWordReverse 
{
public static void main(String[] args) 
{
	 Scanner s=new Scanner(System.in);
	  System.out.println("enter words that u want to revers");
     String str=s.nextLine();
     String rev="";
     System.out.println("Reverse the words is :");
     String a[]=str.split(" ");
        for(int i=a.length-1;i>=0;i--)
			{
        	 rev=rev+" "+a[i];
			}
        System.out.println(rev);
}
}
