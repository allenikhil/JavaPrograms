package StringPgms;
import java.util.Scanner;
public class FirstLetterOfWord 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter words ");
        String str=s.nextLine();
        String a[]=str.split(" ");
        String out="";
        for(int index=0;index<=a.length-1;index++)
        {
        	char ch=a[index].charAt(0);
        	out=out+ch;
        }
        System.out.println(out);
	}

}
