class A 
{
	A()
	{
		System.out.println("In A class def const..");
	}
	A(int i)
	{
		this();
		System.out.println("In A class int const..");
	}
	A(double i)
	{
		this(6);
		System.out.println("In A class double const..");
	}
	public static void main(String[] args) 
	{
		A a1=new A(5.7);
	}
}
