class Rect 
{
	int l,w;
	Rect(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	Rect(Rect r1)
	{
		this.l=r1.l;
		this.w=r1.w;
	}
	public void rectDim()
	{
		System.out.println("======");
		System.out.println("length is:"+l);
		System.out.println("width is:"+w);
	}
}
class Mspaint
{
	public static void main(String[] args) 
	{
       Rect r1=new Rect(1,2);
	   Rect r2=new Rect(4,5);
	   Rect r3=new Rect(7,8);
	   Rect r4=new Rect(r2);
	   r1.rectDim();
	   r2.rectDim();
	   r3.rectDim();
	   r4.rectDim();
	}
}
