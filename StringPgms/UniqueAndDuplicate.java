package StringPgms;
import java.util.Scanner;
public class UniqueAndDuplicate
{ 
	static int []arr=new int[123];
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.next();
		for(int index=0;index<=s1.length()-1;index++)
		{
			char ch=s1.charAt(index);
			int ascii=ch;
			arr[ascii]++;
		}
		System.out.println(check());//true means duplicate letters available and false means no duplicate letters available
	}
	public static boolean check()
	{
		
		for(int index=0;index<123;index++)
		{
			if(arr[index]>1)
			{
			return true;
			}
	    }
		return false;
	}

}

