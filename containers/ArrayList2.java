package containers;
import java.util.*;
class Employee
{
	int id;
	String eName;
	public Employee(int id, String eName)
	{
		this.id = id;
		this.eName = eName;
	}
	public String toString()
	{
		return eName;
	}
	public void empInfo()
	{
		System.out.println("Employee name is:"+eName);
		System.out.println("Employee Id is:"+id);
	}
	 
}
class Car
{
	String bn;
	int ts;
	public Car(String bn, int ts)
	{
		this.bn = bn;
		this.ts = ts;
	}
	
	public String toString()
	{
		
		return bn;
	}
	public void carInfo()
	{
		System.out.println("Car BrandName is:"+bn);
		System.out.println("Car TopSpeed is:"+ts);
	}
}
class Rectangle
{
	int l,w;

	public Rectangle(int l, int w) 
	{
		this.l = l;
		this.w = w;
	}
	public String toString()
	{
		return "length is"+l+"width is"+w;
	}
	public int area(int l,int w)
	{
		return l*w;
	}
	
}
class Book 
{
	String bt,ba;

	public Book(String bt, String ba) 
	{
		this.bt = bt;
		this.ba = ba;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bt;
	}
	public void bookInfo()
	{
		System.out.println("Book Title name is"+bt);
		System.out.println("Book Author name is"+ba);
	}
	
	
}

public class ArrayList2
{
  public static void main(String[]args)
  {
	  ArrayList a1=new ArrayList();
	  a1.add(new Employee(123,"nikhil"));
	  a1.add(new Employee(124,"naveen"));
	  System.out.println(a1.get(1));
  }
   
}
