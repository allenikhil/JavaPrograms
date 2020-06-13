package LeargeCodePgms;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapOddNumbersInArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<=size-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		swap(arr);
	}
	public static void swap(int []arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==1)
			{
				count++;
				if(count==2)
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
				}
			}
			else if(arr[i]%2==0)
            {
	           count=0;
            }
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
