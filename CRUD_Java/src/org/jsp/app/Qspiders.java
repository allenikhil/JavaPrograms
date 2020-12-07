package org.jsp.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Qspiders 
{
@Id
  private int Student_id;
  private String Student_name;
public int getStudent_id() {
	return Student_id;
}
public void setStudent_id(int student_id) 
{
	Student_id = student_id;
}
public String getStudent_name() 
{
	return Student_name;
}
public void setStudent_name(String student_name)
{
	Student_name = student_name;
}
@Override
public String toString()
{
	return "Qspiders [Student_id=" + Student_id + ", Student_name=" + Student_name + "]";
}
  


}
