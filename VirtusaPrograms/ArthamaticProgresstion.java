package VirtusaPrograms;

import java.util.Scanner;

public class ArthamaticProgresstion 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2nd Number in A.p");
	int in1=sc.nextInt();
	System.out.println("Enter 3rd Number in A.p");
	int in2=sc.nextInt();
	System.out.println("Enter which Postion of Element u want to Print");
	int n=sc.nextInt();
	
	int d=in2-in1;
	int f=in1-d;
	System.out.println(f+(n-1)*d);	
}
}
