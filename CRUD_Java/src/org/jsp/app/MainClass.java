package org.jsp.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass
{
public static void main(String[] args) 
{
	Configuration confg=new Configuration();
	 
	confg.configure("XML File.xml");
	
	SessionFactory sef=confg.buildSessionFactory();
	
	Session ses=sef.openSession();
	
	Transaction t=ses.beginTransaction();
	Scanner sc=new Scanner(System.in);
	System.out.println("Select a Option");
	System.out.println("1.Insert Query");
	System.out.println("2.Select Query");
	System.out.println("3.Update Query");
	System.out.println("4.Delete Query");
	switch(sc.nextInt())
	{
	case 1: Qspiders q1=new Qspiders();
	        System.out.println("Enter Id");
	        q1.setStudent_id(sc.nextInt());
	        System.out.println("Enter name");
	        q1.setStudent_name(sc.next());
	        ses.save(q1);
			break;
		
	case 2:  System.out.println("Enter Id to select");
	         Qspiders ref1=(Qspiders) ses.get(Qspiders.class, sc.nextInt());
	         System.out.println(ref1);
	         break;
		
	case 3: System.out.println("Enter Id to update(old id)");
    		Qspiders ref2=(Qspiders) ses.get(Qspiders.class, sc.nextInt());
    		System.out.println("Enter name to update");
    		ref2.setStudent_name(sc.next());
    		ses.update(ref2);
    		System.out.println(ref2);
    		break;

	case 4: System.out.println("Enter Id to delete");
	     	Qspiders ref3=(Qspiders) ses.get(Qspiders.class, sc.nextInt()); 
	     	ses.delete(ref3);
	     	break;
	
		default:System.out.println("Enter correct option");
		        break;
	}
	t.commit();
	ses.close();
}
}
