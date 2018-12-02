package VirtusaPrograms;

import java.util.Scanner;

public class GCD_LCM
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int gcd=1;
	System.out.println("Enter 1st Number");
	int n1=sc.nextInt();
	System.out.println("Enter 2nd Number" );
	int n2=sc.nextInt();
	int grt=(n1>n2)?n1:n2;
	for(int r=1;r<=grt;r++)
	{
		if(n1%r==0 && n2%r==0)
		{
			grt=r;
		}
	}
	System.out.println(grt);
}
}
