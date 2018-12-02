package StringPgms;
import java.util.Scanner;
public class DuplicateLetters 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String s1=sc.nextLine();
			int []arr=new int[123];
			for(int index=0;index<=s1.length()-1;index++)
			{
				char ch=s1.charAt(index);
				int ascii=ch;
				arr[ascii]++;
			}
			for(int index=0;index<123;index++)
			{
				if(arr[index]>1)
				{
					
				System.out.println("No of " +(char) index+ " letters are:"+arr[index]);
				}
		    }
		}
	}
