package PatternPgms;
public class Pattern2
{
public static void main(String[] args)
{
	int num=1;
	char ch='z';
    for(int i=1;i<=4;i++)
    {
    	for(int j=1;i>=j;j++)
    	{
    		System.out.print(ch+""+num);
    		ch--;
    		num++;
    	}
    	System.out.println();
    }
}
}
