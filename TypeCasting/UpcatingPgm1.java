class A 
{
	public void move()
	{
		System.out.println("move north");
	}
}
class B extends A
{
	public void move1()
	{
		System.out.println("move to east");
	}
}
class UpcatingPgm1
{
	public static void main(String[] args) 
	{
		A r1=(A)new B();
		r1.move();
		B r2=(B) r1;
		r2.move1();
		r2.move();
	}
}
