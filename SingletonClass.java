package javaexamples;

public class SingletonClass
{
	static int i=10;
	int j=20;
  private static SingletonClass sc=null;
  private SingletonClass() {}
  public static SingletonClass getInstance()
  {
	  if(sc==null)
		  sc= new SingletonClass();
	  return sc;
  }
  public static void main(String[] args) 
  {
	SingletonClass s= new SingletonClass();
	System.out.println(s.j);	
 }
}
