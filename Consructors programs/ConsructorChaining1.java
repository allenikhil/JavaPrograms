class Shape
{
	int l,w,h;
	Shape(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	Shape(int l,int w,int h)
	{
		this(l,w);
		this.h=h;
	}
	public void shapeInfo()
	{
		System.out.println("length is:"+l);
		System.out.println("width is:"+w);
		if(h!=0)
			System.out.println("height is:"+h);
	}
	public static void main(String[] args) 
	{
       Shape s1=new Shape(5,6);
	   Shape s2=new Shape(3,8,4);
	   s1.shapeInfo();
	   s2.shapeInfo();
	}
}
