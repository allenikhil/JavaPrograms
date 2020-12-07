abstract class A// Abstract class because it has abstract method
{
	 public void run()
	{
		System.out.println("Run 2 kms");
	}
}  
class B extends A //sub class inherits abstract class so it has follow 2 rules 1.declare subclass as abstract or 2.abstract method should be overrided.If any one of the rule is not fullfill program compilation fails
{
   public void run1()
	{
	   System.out.println("Run 5 kms");
	}
}
class Abstractpgm5
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		B rv1=new B();
		rv1.run();
		rv1.run1();
		System.out.println("main ends");
	}
}
