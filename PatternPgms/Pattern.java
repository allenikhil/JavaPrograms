package PatternPgms;
public class Pattern 
{
public static void main(String[] args)
{
	int num=1;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;i>=j;j++)
		{
		   System.out.print(num%2);
		   num++;
		}  
		System.out.println();	
	}
}
}
