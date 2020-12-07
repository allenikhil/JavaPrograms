package Arrays;

public class Missing
{
	public static void main(String [] args)
	{
int []a={32,14,96,83,65,8,43};
int status=0;
for(int i=1;i<=100;i++)
{
	for(int j=0;j<=a.length-1;j++)
	{
		if(i==a[j])
		{
			status=1;
			break;
		}
	}
	if(status==0)
	{
		System.out.println(i);
	}
	status=0;
}
}
}
