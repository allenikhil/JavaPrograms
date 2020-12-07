package containers;
import java.util.*;
public class Car
{
  String bn,cl;
  int ts;
  double ml;
public Car(String bn, String cl, int ts, double ml) {
	super();
	this.bn = bn;
	this.cl = cl;
	this.ts = ts;
	this.ml = ml;
}
  public String toString()
  {
	  return bn;
  }
}
class Run 
{
	public static void main(String[]args)
	{
		ArrayList a1=new ArrayList();
		a1.add(new Car("audi","red",240,3.5));
		a1.add(new Car("benz","blue",250,5.3));
		a1.add(new Car("bmw","white",320,2.2));
		a1.add(new Car("jaguar","black",270,2.8));
		System.out.println("before sort..");
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		TopSpeedSort ts=new TopSpeedSort();
		Collections.sort(a1,ts);
		System.out.println("after sort..");
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		BrandNameSort bn=new BrandNameSort();
		Collections.sort(a1,bn);
		System.out.println("after sort..");
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
	}
}

