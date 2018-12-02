package LeargeCodePgms;

import java.util.*;
public class MergeArray 
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter 1st array size:");
	  System.out.println("Enter 2nd array size:");
	  int size1=sc.nextInt();
	  int size2=sc.nextInt();
	  int arr1[]=new int[size1];
	  int arr2[]=new int[size2];
	  System.out.println("Enter 1st array elements:");
	  for(int i=0;i<=size1-1;i++)
	  {
		  arr1[i]=sc.nextInt();
	  }
	  System.out.println("Enter 2nd array elements:");
	  for(int i=0;i<=size2-1;i++)
	  {
		  arr2[i]=sc.nextInt();
	  }
	  merge(arr1,arr2);
  }
  public static void merge(int arr1[],int arr2[])
  {
	  int expandLength=(arr1.length)+(arr2.length);
	  int expandArray[]=new int[expandLength];
	  int mergeValue=0,l=arr1.length;
	  for(int i=0;i<=expandArray.length-1;i++)
	  {
		  if(i<l)
		  {
		  expandArray[i]=arr1[i];
		  }
		  else
		  {
			  expandArray[i]=arr2[mergeValue]; 
			  mergeValue++;
		  }  
	  }
	  System.out.println("after mergeing");
	  for(int i=0;i<=expandArray.length-1;i++)
	  {
		  System.out.print(expandArray[i]);
	  }
  }
}
