import java.util.*;
public class SetExample {
	static void validate(boolean b)throws InvalidObjectException
	{  
	     if(b==false)  
	      throw new InvalidObjectException("Same values of object alredy added set doesnot allow duplicate objects");  
	   }  
	public static void main(String[] args) {
		Employee e1=new Employee("123", "nikhil");
		Employee e2=new Employee("123", "nikhil");
		Set<Employee> s=new HashSet<>();
		try {
		validate(s.add(e1));
		validate(s.add(e2));
		}catch(Exception m){System.out.println("Exception occured: "+m);}  
	for(Employee e:s)
	{
		System.out.println(e.getEmpId()+" "+e.getEmpName());
	}
	System.out.println(s);
	}

}
