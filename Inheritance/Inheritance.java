class A 
{
	int i;
	A(int i)
	{
		this.i=i;
	}
}
class B extends A
{
	int j;
	B(int j)
	{
		this.j=j;
	}
}
class Inheritancepgm1
{
	public static void main(String[] args) 
	{
		A a1=new A(5);
		B b1=new B(6);
		System.out.println(a1.i);
		System.out.println(b1.j);

	}
}
