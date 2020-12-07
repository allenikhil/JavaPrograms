class M
{
static int x=50;
public void move()
{
int x=60;
System.out.println(x);
System.out.println(M.x);
}
public static void main(String []s)
{
System.out.println("main starts");
M n1=new M();
M n2=new M();
n1.move();
n2.move();
System.out.println("main ends");
}
}
