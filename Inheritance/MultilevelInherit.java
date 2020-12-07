class C // Exmple for Multilevel Inheritance
{
	int i;
	C(int i)
	{
		this.i=i;
	}
}
class D extends C //Here it Inherit properties from C class 
{
	double j;
	D(int i,double j)
	{
		super(i);
		this.j=j;
	}
}
class E extends D // It Inherit properties from D class this is know as Multilevel Inheritance
{
	int k;
	E(int i,double j,int k)
	{
		super(i,j);
		this.k=k;
	}
}
class MultilevelInherit
{
	public static void main(String[] args) 
	{
		E r1=new E(7,8.1,9);
		System.out.println(r1.i);
		System.out.println(r1.j);
		System.out.println(r1.k);
	}
}
