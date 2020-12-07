/*Prg:Write a java program that loads names and phone numbers from the text file where data is organized as one line per record and each field in record are separated by a tab(\t).It takes a name or phone number as input and prints corresponding other value from hash table(hint: use Hash Table)*/

import java.util.*;
import java.io.*;
import java.util.Map.Entry.*;
public class Hash {
public static void main(String[] args) {
try {
FileInputStream fs = new FileInputStream("/home/student/Desktop/Kiran/Exec/ph.txt");
Scanner sc = new Scanner(fs).useDelimiter("\\s+");
Hashtable<String, String> ht = new Hashtable<String, String>();
String[] arrayList;
String a;
System.out.println("Welcome TO NMREC");
System.out.println("HASH TABLE IS");
System.out.println("--------------------------");
System.out.println("KEY : VALUE");
while (sc.hasNext()) {
a = sc.nextLine();
arrayList = a.split("\\s+");
ht.put(arrayList[0], arrayList[1]);
System.out.println(arrayList[0] + ":" + arrayList[1]);
} // while close
System.out.println("Welcome TO NMREC");
System.out.println("----MENU------");
System.out.println("----1.Search by Name------");
System.out.println("----2.Search by Mobile------");
System.out.println("----3.Exit------");
String opt = "";
String name, mobile;
Scanner s = new Scanner(System.in);
while (opt != "3") {
System.out.println("Enter Your Option 1,2,3");
opt = s.next();
if(opt.equals("1"))
{
System.out.println("Enter Name");
name = s.next();
if (ht.containsKey(name)) 
{
System.out.println("Mobile is " + ht.get(name));
} 
else 
{
System.out.println("Not Found");
}
}//if close
else if(opt.equals("2"))
{
System.out.println("Enter mobile");
mobile = s.next();
if (ht.containsValue(mobile)) 
{
for (Map.Entry e : ht.entrySet()) 
{
if (mobile.equals(e.getValue())) 
{
System.out.println("Name is " + e.getKey());
}//if close
}//for close
}// if close 
else 
{
System.out.println("Not Found");
}// else close
}// else if close
else if(opt.equals("3"))
{
opt = "3";
System.out.println("Menu Successfully Exited");
}// else if close
else
{
System.out.println("Choose Option betwen 1 and Three");
}
}
}// try close
catch(Exception ex) {
System.out.println(ex.getMessage());
}
}// main close
}
