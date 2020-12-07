class  A //Exmple of both  Implict way and Explict way of constructor chaining
{
	A()
	{
		System.out.println("In A default constructor");
	}
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
		System.out.println("In B double arg constructor...");//Here Implict way because we forgot to call constructor so default constructor will call
	}
}
class Inheritpgm5
{
	public static void main(String[] args) 
	{
		B b1=new B();
		B b2=new B(5.3);
	}
}
