package containers;
import java.util.*;
public class Tree implements Comparable
{
String tn;
double th;
public Tree(String tn, double th) 
{
	this.tn = tn;
	this.th = th;
}
public String toString()
{
	return tn;
}
public boolean equals(Object o1) 
{
   Tree t1=(Tree)o1;		
		return this.th==t1.th;
}
public int compareTo(Object o1)
{
	Tree t1=(Tree)o1;
	if(this.th>t1.th)
	{
		return 1;
	}
	else if(this.th<t1.th)
	{
		return -1;
	}
	else
	{
		return 0;
	}
	
}
}
class Test
{
public static void main(String[]args)
{
	ArrayList a1=new ArrayList();
	a1.add(new Tree("apple",5.6));
	a1.add(new Tree("mango",5.6));
	a1.add(new Tree("banana",5.8));
	a1.add(new Tree("orange",5.3));
	a1.add(new Tree("grape",5.7));
	System.out.println("before sort");
	for(int i=0;i<=a1.size()-1;i++)
	{
		System.out.println(a1.get(i));
	}
	Collections.sort(a1);
	System.out.println("After sort");
	for(int i=0;i<=a1.size()-1;i++)
	{
		System.out.println(a1.get(i));
	}
	
}
}
