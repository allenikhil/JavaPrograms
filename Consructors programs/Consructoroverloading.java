class Demo
{
	Demo()
	{
		System.out.println("In demo class default const..");
	}
	Demo(double i)
	{
		System.out.println("In demo class double const..");
	}
	Demo(int i)
	{
		System.out.println("In demo class int cns..");
	}
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		Demo d2=new Demo(2);
		Demo d3=new Demo(3.8);
	}
}
