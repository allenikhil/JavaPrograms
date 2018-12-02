package LeargeCodePgms;

import java.util.Scanner;

public class SmallDigit
{
	static String s1;
	public static void main(String[] args) 
	{
		int count=0,value=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		String num=sc.next();
		for(int j=Integer.parseInt(num);j>=0;j--)
		{
			String s2=j+"";
			for(int i=0;i<=s2.length()-1;i++)
			{
				char ch=s2.charAt(i);
				s1=ch+"";
				if(num.contains(s1))
				{
					
				}
				else
				{
					count++;
					if(count==s2.length()&&value==0)
					{
						value++;
						System.out.println(j);
					}
				}//end of else
			}//end of i for loop
			count=0;
		}
	}
}
