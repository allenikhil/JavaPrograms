package VirtusaPrograms;

import java.util.Scanner;

//In some language a is printed as x so move 3 postions to left i/p:abc o/p:xyz
//this program takes i/p:xyz and o/p:abc
public class Encryption 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	char[]arr= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	System.out.println("Enter a String");
	String es=sc.next();
	String out="";
	for(int i=0;i<=es.length()-1;i++)
	{
		char ch=es.charAt(i);
		for(int in=0;i<=es.length()-1;in++)
		{
			if(ch==arr[in])
			{
				switch(in)
				{
				case 23:out=out+'a';
						break;
				case 24:out=out+'b';
						break;
				case 25:out=out+'c';
						break;
						default:out=out+arr[in+3];
								break;
				}
				break;
			}
		}
	}
	System.out.println(out);
}
}
