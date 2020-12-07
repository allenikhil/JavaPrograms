/* Missing Statement ? */
class foo 
{
public static void main(String arg[])
{
    String a = "ABCD"; 
String b = a.toLowerCase(); 
b.replace('a','d');			//it is used to temporary to print dbcd 
b.replace('b','c'); 
System.out.println(b);	 /*	it not print dccd it print abcd only above stmts only temporary
								visibility only it that stmts write in print stmt it will replace and print*/
    } 
}