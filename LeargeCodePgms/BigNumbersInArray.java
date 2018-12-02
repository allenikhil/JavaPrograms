package LeargeCodePgms;

import java.util.ArrayList;
import java.util.Scanner;

public class BigNumbersInArray
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int size=sc.nextInt();
	ArrayList a1=new ArrayList(size);
	System.out.println("enter array elements");
	for(int i=0;i<=size-1;i++)
	{
		a1.add(sc.nextInt());
	}
	bigNumber(a1,1);
	bigNumber(a1,2);
	sc.close();
}
public static void bigNumber(ArrayList a1,int b)
{
	int bigNumber=(int) a1.get(0);
	int index=0;
	for(int i=0;i<=a1.size()-1;i++)
	{
		if(bigNumber<(int) a1.get(i))
		{
			bigNumber=(int) a1.get(i);
			index=i;
		}
	}
	if(b==1)
	{
	System.out.println("1st biggest number in array is "+bigNumber);
	a1.remove(index);
	}
	else if(b==2)
	{
		System.out.println("2nd biggest number in array is "+bigNumber);
		a1.remove(index);
	}
}
}
