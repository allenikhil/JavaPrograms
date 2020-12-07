abstract class C
{
	abstract public void run1();
    abstract public void run2();
}  
abstract class D extends C
{
   public void run1()
	{
	   System.out.println("Run 10 kms");
	}
}
class E extends D
{
	public void run2()
	{
		System.out.println("run 15 kms ..");
	}
}
class Abstractpgm2
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		E rv1=new E();
		rv1.run1();
		rv1.run2();
		System.out.println("main ends");
	}
}
