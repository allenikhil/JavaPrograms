package Arrays;

public class Sorting
{
public static void main(String [] args)
{
	int [] a1={45,16,78,36,54};
	int temp=0;
	for(int x=1;x<=a1.length-1;x++)
	{
		for(int y=0;y<=a1.length-2;y++)
		{
			if(a1[y]<a1[y+1])
			{
				temp=a1[y];
				a1[y]=a1[y+1];
				a1[y+1]=temp;
			}
		}
	}
	for(int i=0;i<=a1.length-1;i++)
	{
		System.out.println(a1[i]);
	}
}
}
