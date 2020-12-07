interface Animal
{
	public void noise();
}
class Lion implements Animal 
{
	public void noise()
	{
		System.out.println("Lion Sound");
	}
}
class Tiger implements Animal
{
	public void noise()
	{
		System.out.println("Tiger Sound");
	}
}
class Zoo
{
	public static void main(String[] args) 
	{
		makesound(new Lion());
		makesound(new Tiger());
	}
	public static void makesound(Lion r1)
	{
		r1.noise();
	}
	public static void makesound(Tiger r1)
	{
		r1.noise();
	}
}
