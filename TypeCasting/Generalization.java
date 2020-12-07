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
		makesound(new Tiger());
		makesound(new Lion());
	}
	public static void makesound(Animal r1)
	{
		r1.noise();
	}
}
