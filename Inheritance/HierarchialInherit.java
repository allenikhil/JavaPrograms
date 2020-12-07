class F // Exmple for Hierarchial Inheritance
{
	int i;
	F(int i)
	{
		this.i=i;
	}
}
class G extends F // Heer it inherit properties from F class
{
	double j;
	G(int i,double j)
	{
		super(i);
		this.j=j;
	}
}
class H extends F // It is also inherit from F class this is called Hierarchial Inheritance
{
	int k;
	H(int i,int k)
	{
		super(i);
		this.k=k;
	}
}
class HierarchialInherit
{
	public static void main(String[] args) 
	{
		H r1=new H(7,9);
		System.out.println(r1.i);
		System.out.println(r1.k);
		G r2=new G(6,6.3);
		System.out.println(r2.i);
		System.out.println(r2.j);
	}
}
