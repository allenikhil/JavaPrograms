class  A//Exmple for Explict way of constructor chaining
{
	A(int i)
	{
		System.out.println("In A int arg constructor..");
	}
}
class B extends A
{
	B()
	{
		super(4);//Explict way of constructor chaining.In this case we forgot to call to super it will through error
		System.out.println("In B default constructor..");
	}
	B(double j)
	{
		super(5);//Explict way means call constructor with argument type
		System.out.println("In B double arg constructor...");
	}
}
class Inheritpgm4
{
	public static void main(String[] args) 
	{
		B b1=new B();
		B b2=new B(5.3);
	}
}
