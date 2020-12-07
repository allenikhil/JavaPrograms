//Prg: Implement above program with database instead of a text File
import java.sql.*;
import java.util.*;
import java.util.Map.Entry.*;
import java.lang.*;
public class Hashdb {
public static void main(String[] args) {
Connection cn;
Statement st;
ResultSet rs;
try {
Class.forName("com.mysql.jdbc.Driver");
cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nmr", "root", "nmrec123");
st = cn.createStatement();
rs = st.executeQuery("select * from phone");
Hashtable<String,String> ht = new Hashtable<String,String>();
System.out.println("Welcome TO NALLA MALLA REDDY ENGINEERING COLLEGE");
System.out.println("HASH TABLE IS");
System.out.println("--------------------------");
System.out.println("KEY : VALUE");
while (rs.next()) {
ht.put(rs.getString("Name"),rs.getString("Mobile"));
System.out.println(rs.getString("Name") + ":" + rs.getString("Mobile"));
}		//while close
rs.close();
st.close();
cn.close();
System.out.println("Welcome TO NMR");
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
if(opt.equals("1")){
System.out.println("Enter Name");
name = s.next();
if (ht.containsKey(name)) {
System.out.println("Mobile is " + ht.getString(name));
} 	//if close
else {
System.out.println("Not Found");
}	//else close
}	//if close
else if(opt.equals("2"))
{
System.out.println("Enter mobile");
mobile = s.next();
if (ht.containsValue(mobile)) {
for (Map.Entry e : ht.entrySet()) {
if (mobile.equals(e.getValue())) {
System.out.println("Name is " + e.getKey());
}	//if close
}	//for close
} 	//if close
else {
System.out.println("Not Found");
}	// else close
}	// else if close
else if(opt.equals("3")){
opt = "3";
System.out.println("Menu Successfully Exited");
}	// else if close
else
System.out.println("Choose Option between 1 and Three");
}	// while close
}	// try close
catch (Exception ex) {
System.out.println(ex.getMessage());
}	// catch close
}	// main close
}	// class close