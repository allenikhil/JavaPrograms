package LeargeCodePgms;
import java.util.Scanner;
public class ArraySwaping
{
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter array size");
	   int size=sc.nextInt();
	   int arr[]=new int[size];
	   System.out.println("enter array values");
	   for(int i=0;i<=size-1;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   halfArraySwap(arr);
	}
	public static void halfArraySwap(int arr[])
	{
		int l=arr.length/2,c=l,x=0;
		   int temp[]=new int[l];
		for(int i=0;i<=l-1;i++)
		   {
			   temp[i]=arr[i];
		   }
		   for(int i=0;i<=temp.length-1;i++)
		   {
			   arr[i]=arr[c];
			   c++;
		   }
		   for(int i=l;i<=arr.length-1;i++)
		   {
			   arr[i]=temp[x];
			   x++;
		   }
		   for(int i=0;i<=arr.length-1;i++)
		   {
			   System.out.print(arr[i]+" ");
		   }
	}

}
