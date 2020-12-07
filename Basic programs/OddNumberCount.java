class OddNumberCount 
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=10;i<=20;i++)
		{
			if(i%2==1)
			{
				count++;
			}
		}
		System.out.println("number of odd numbers present b/w 10 to 20 is :"+count);
	}
}
