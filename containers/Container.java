package containers;

public class Container
{
 private int [] a1=new int [3];
 private int p=0;
 private void increaseSize()
 {
	 int n=a1.length+3;
	 int []b1=new int[n];
	 for(int k=0;k<=a1.length-1;k++)
	 {
		 b1[k]=a1[k];
	 }
	 a1=b1;
 }
 public void add(int i)
 {
	 if(p==a1.length)
		 increaseSize();
	 a1[p]=i;
	 p++;
 }
 public int get(int index)
 {
	 return a1[index];
 }
}
 class App
{
	public static void main(String [] args)
	{
		Container c1=new Container();
		c1.add(56);
		c1.add(32);
		c1.add(24);
		c1.add(76);
		c1.add(89);
		c1.add(12);
		c1.add(23);
		c1.add(33);
		System.out.println(c1.get(4));
	}
}
