class Demo
{
	public void move()
	{
		System.out.println("move north");
	}
}
class Sample extends Demo
{
	public void move()
	{
		System.out.println("move to east");
	}
}
class UpcatingPgm2
{
	public static void main(String[] args) 
	{
		Demo r1=new Sample();
		r1.move();
		Sample r2=(Sample) r1;
		r2.move();
	}
}
