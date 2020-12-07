/*Prg: Suppose that a table named Table.txt is stored in a text file. The First line in the file is the header, and the remaining lines correspond rows in table. The elements are separated by commas. Write java program to display the table using Label in Grid Layout.*/

//package tbl;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class A extends JFrame {
public A() {
setSize(400, 400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
GridLayout g = new GridLayout(0, 3);
setLayout(g);
try {
FileInputStream fin = new FileInputStream("/home/student/Desktop/Kiran/emp.txt");
Scanner sc = new Scanner(fin).useDelimiter(",");
String[] arrayList;
String a;
while (sc.hasNextLine()) {
a = sc.nextLine();
arrayList = a.split(",");
for (String i : arrayList) {
add(new JLabel(i));
}
}
} catch (Exception ex) {
}
setDefaultLookAndFeelDecorated(true);
pack();
setVisible(true);
}
}
public class Tbl {
public static void main(String[] args) {
A a = new A();
}
}
