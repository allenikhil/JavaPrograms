interface P
{
	public void move10();
}
class Q 
{
	public void move11()
	{
		System.out.println("move north ");
	}
}
class R extends Q implements P
{
	public void move10()
	{
		System.out.println("move south ");
	}
}
class Interfacepgm5
{
	public static void main(String[] args) 
	{
		P r1=new R();
		r1.move10();
		R r2=(R) r1;
		r2.move10();
		r2.move11();
	}
}
