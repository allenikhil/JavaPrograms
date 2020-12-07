interface M
{
	public void move8();
}
interface N
{
	public void move9();
}
class O implements M,N 
{
	public void move8()
	{
		System.out.println("move north ");
	}
	public void move9()
	{
		System.out.println("move south ");
	}
}
class Interfacepgm4
{
	public static void main(String[] args) 
	{
		O r1=new O();
		r1.move8();
		r1.move9();
	}
}
