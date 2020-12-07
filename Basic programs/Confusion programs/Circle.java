class Circle
{
int r;
static double pi=3.14;
public void findArea()
{
double res=pi*r*r;
System.out.println("Area of a circle is:"+res);
}
}
class Mspaint
{
public static void main(String [] s)
{
Circle c1=new Circle();
Circle c2=new Circle();
c1.r=5;
c2.r=6;
c1.findArea();
c2.findArea();
}
}