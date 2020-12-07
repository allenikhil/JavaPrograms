package helpermethod1;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Object Type");
		String s=sc.next();
		Animal a=getObject(s);
		a.eat();
		a.noise();
	}
	public static Animal getObject(String s1)
	{
		Animal a1=null;
		if(s1.equalsIgnoreCase("Lion"))
		{
			a1=new Lion();
		}
		else if(s1.equalsIgnoreCase("Tiger"))
		{
			a1=new Tiger();
		}
		return a1;
	}

}
