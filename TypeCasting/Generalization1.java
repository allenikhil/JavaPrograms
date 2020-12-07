abstract class shape 
{
	public void rotate()
	{
		System.out.println("clockwise");
	}
	abstract public void fecthArea();
}
class circle extends shape
{
	static double pi=3.14;
	int r;
	circle(int r)
	{
		this.r=r;
	}
	public void fecthArea()
	{
		System.out.println("Area of circle is:"+pi*r*r);
	}
	public void circumference()
	{
		System.out.println("circumference is :"+2*pi*r);
	}
}
class Rect extends shape
{
	int l,w;
	Rect(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public void fecthArea()
	{
		System.out.println("Area of rect is:"+l*w);
	}
	public void perimeter()
	{
		System.out.println("perimeter is :"+2*(l+w));
	}
}
class Photoshop
{
	public static void main(String[] args) 
	{
	  invoke(new circle(5));
	  invoke(new Rect(6,7));
	}
	public static void invoke(shape s1)
	{
		s1.rotate();
		s1.fecthArea();
		if(s1 instanceof circle)
		{
			circle c1=(circle)s1;
			c1.circumference();
		}
		else if(s1 instanceof Rect)
		{
			Rect r1=(Rect)s1;
			r1.perimeter();
		}
	}
}
