package javaexamples;

import java.util.*;//not completed

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
	   
	   int max=arr[0];
	   int position=0;
       for(int j=1;j<95;j++)
       {
           if(max<arr[j])
               {
                   max=arr[j];
                   position=j;
               }
       }
		   System.out.println("Maximum Occurence is "+max+" of character "+(char)position);
	   
	}
}
