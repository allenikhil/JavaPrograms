abstract class F
{
    public static void move()//If abstract class consist of static members,it can be access in another class only through class Nmae
	{
		System.out.println("move north...");
	}
}  
class Abstractpgm3
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		F.move();
		F rv1=new F();//Error because class is abstract.Abstract class canot creat objects
		rv1.move();
		System.out.println("main ends");
	}
}
