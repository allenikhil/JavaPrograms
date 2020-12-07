package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
public static void main(String[] args) {
	
ApplicationContext ac=new ClassPathXmlApplicationContext("spring_dependency_injection.xml");
	
	Student st=(Student) ac.getBean("s1");
	System.out.println(st);
}
}

