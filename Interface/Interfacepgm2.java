interface F
{
	public void move4();
}
 class G implements F 
{
	public void move4()
	{
		System.out.println("move north ");
	}
}
class H implements F
{
    public void move4()
	{
		System.out.println("move south ");
	}
}
class Interfacepgm2
{
	public static void main(String[] args) 
	{
		G r1=new G();
		r1.move4();
		H r2=new H();
		r2.move4();
	}
}
