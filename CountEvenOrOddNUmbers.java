package LeargeCodePgms;



import java.util.Scanner;

public class CountEvenOrOddNUmbers 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int ecount=0;
		int ocount=0;
		while(num>0)
		{
			int check=num%10;
			if(check%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
			num=num/10;
		}
		System.out.println("In above number the no of even numbers are : " +ecount+ "&  no of odd numbers are: "+ocount);
	}

}
