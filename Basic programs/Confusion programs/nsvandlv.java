class N
{
int x=50;
public void move()
{
int x=60;
System.out.println(x);
System.out.println(this.x);
}
public static void main(String []s)
{
System.out.println("main starts");
N n1=new N();
N n2=new N();
n2.x=99;
n1.move();
n2.move();
System.out.println("main ends");
}
}
