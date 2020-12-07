package org.jsp.app;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainHibernate 
{
	public void loginWithHibernate(String nm, String ps)
	{  
		Configuration confg=new Configuration();
		confg.configure("XML File.xml");
		
		SessionFactory sef=confg.buildSessionFactory();
		
		Session ses=sef.openSession();
		
	 Transaction  t= ses.beginTransaction();
		System.out.println("hibernate");
		System.out.println(ses);
		System.out.println(t);
		System.out.println(nm);
		login l=new login();
		System.out.println(ps);
		l.setName(nm);
		l.setPassword(ps);
		ses.save(l);
		System.out.println("last");
		t.commit();
		ses.close();
	}
	
}
