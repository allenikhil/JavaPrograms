class swap
{
public static void main(String [] s)
{
int n=10,m=20;
System.out.println("Before swapping ");
System.out.println("n="+n);
System.out.println("m="+m);
m=(n+m)-(n=m);
System.out.println("After swapping");
System.out.println("n="+n);
System.out.println("m="+m);
}
}