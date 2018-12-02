package PatternPgms;
public class Pattern1
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;i>=j;j++)
			{
				if(j%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
