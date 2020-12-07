class A//Exmple for Implict way of constructor chaining 
{
	A()
	{
		System.out.println("In A default constructor");
	}
}
class B extends A
{
	B()
	{
		super();//Implict way of constructor chaining
		System.out.println("In B default constructor");
	}
	B(double i)
	{
		System.out.println("In B double arg constructor");// if we dont add super of default constructor compiler will add.In this case compiler will add call to super is super();
	}
}
class Inheritpgm3
{
	public static void main(String[] args) 
	{
		B b1=new B();
		B b2=new B(6.3);
	}
}
