package javaexamples;
import java.util.*;
import java.text.*;
public class TimeFormat
{
	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1.getDate()+" "+d1.getMonth()+" "+d1.getYear());
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy-hh:mm:ss");
		System.out.println(sd.format(d1));
	}

}
