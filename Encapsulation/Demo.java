package Encapsulation;

public class Demo {
	private int a=50;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
class Run
{
	public static void main(String []args)
	{
		Demo r1=new Demo();
		System.out.println(r1.getA());
		r1.setA(20);
		System.out.println(r1.getA());
	}
}
