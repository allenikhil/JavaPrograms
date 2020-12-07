interface C
{
	public void move1(int i);
}
interface D extends C
{
	public void move2();
}
class E implements D 
{
	public void move1(int i)
	{
		System.out.println("move north "+i);
	}

    public void move2()
	{
		System.out.println("move south ");
	}
}
class F
{
	public static void main(String[] args) 
	{
		E r1=new E();
		r1.move1(5);
		r1.move2();
	}
}
