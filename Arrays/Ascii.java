package Arrays;

public class Ascii 
{
 public static void main(String []args)
 {
	 int []arr=new int[98];
	 String s1="Java";
	 for(int k=0;k<=s1.length()-1;k++)
	 {
		 int ascii=s1.charAt(k);
		 if(ascii==97)
		 arr[ascii]++;
	 }
	 System.out.println(arr[97]);
 }
}
