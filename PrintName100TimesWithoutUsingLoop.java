package javaexamples;

public class PrintName100TimesWithoutUsingLoop {

	public static void main(String[] args)
	{
		String n="Nikhil";
		String s="r";
		
		s=s.replaceAll("r", "rrrrrrrrrr");
		s=s.replaceAll("r", "rrrrrrrrrr");
		s=s.replaceAll("r", n + "\n");
		System.out.println(s);
	}

}
