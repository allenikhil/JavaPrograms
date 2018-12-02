package StringPgms;
import java.util.Scanner;
public class ReplaceLetters 
{
  public static void main(String[] args)
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a word");
	 String word=sc.next();
	 String out="";
	 int count=0;
	 for(int i=word.length()-1;i>=0;i--)
	 {
		 char ch=word.charAt(i);
		 if(ch=='a'||ch=='A')
		 {
			 out="xa"+out;
		 }
		 else if(ch=='e' ||ch== 'E' & count>1)
		 {
			 if(count==0)
			 {
			 out="xe"+out;
			 count++;
			 }
		 }
		 else
		 {
			 out=ch+out;
		 }
		 
	 }
	 System.out.println(out);
}
}
