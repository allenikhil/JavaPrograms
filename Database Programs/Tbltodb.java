/*Prg:Write a Java Program that takes tab separated data(one record line)from a text file and insert them into a database*/

//package tbltodb;
import java.sql.*;
import java.io.*;
import java.util.*;
public class Tbltodb {
public static void main(String[] args) {
Connection cn;
Statement st;
try
{
Class.forName("com.mysql.jdbc.Driver");
cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nmr","root","nmrec123");
st=cn.createStatement();
String sql="";
FileInputStream fin=new FileInputStream("/home/student/Desktop/Kiran/emp.txt");
Scanner sc=new Scanner(fin);
String[] arrayList;
String a="";
int i=0;
while(sc.hasNext())
{
a=sc.nextLine();
arrayList =a.split("\\s+");
sql="insert into emp values("+"'"+arrayList[0]+"','"+arrayList[1]+"','"+arrayList[2]+"')";
st.execute(sql);
i++;
System.out.println(arrayList[0]+":"+arrayList[1]+":"+arrayList[2]);
}
System.out.println(i+" Records are inserted");
st.close();
cn.close();
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}