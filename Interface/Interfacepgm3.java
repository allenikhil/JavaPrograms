interface I
{
	public void move5();
}
interface J 
{
	public void move6();
}
interface K extends I,J
{
	public void move7();
}
class L implements K 
{
	public void move5()
	{
		System.out.println("move north ");
	}
	public void move6()
	{
		System.out.println("move south ");
	}
	public void move7()
	{
		System.out.println("move west ");
	}
}
class Interfacepgm3
{
	public static void main(String[] args) 
	{
		L r1=new L();
		r1.move5();
		r1.move6();
		r1.move7();
	}
}
