package org.jsp.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class login 
{
  private String name;
  @Id
 private  String password;

public String getName() 
{
	return name;
}

public void setName(String name)
{
	this.name = name;
}


public String getPassword() 
{
	return password;
}


public void setPassword(String password) 
{
	this.password = password;
}

public String toString() 
{
	return "login [name=" + name + ", password=" + password + "]";
}



  
}
