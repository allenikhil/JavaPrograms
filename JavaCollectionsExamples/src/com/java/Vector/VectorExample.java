package com.java.Vector;

import java.util.Vector;
import java.util.stream.Stream;

public class VectorExample {
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>(); 
		
		v.add("It");
		v.add("is");
		v.add("For");
		v.add("Testing");
		v.add("This is not useful");
		v.remove("This is not useful");
		System.out.println(v);
		System.out.println(v.capacity());
		v.add("ibc");
		v.add("It");
		v.add("is");
		v.add("For");
		v.add("Testing");
		v.add("This is not useful");
		v.add("This is not useful");
		v.add("This is not useful");
		v.add("abc");
		v.add("abz");
		v.add("aec");
		v.add("zbc");
		v.add("ebc");
		System.out.println(v);
		v.removeIf(s -> s.endsWith("i"));  //fillters 
		System.out.println(v);
		System.out.println(v.capacity());
		
		
		//Streams
		
		//Creating the stream of all names
		Stream<String> allNames = v.stream();
			
		
		//Creating another stream by filtering long names using filter()
		Stream<String> longNames = allNames.filter(str -> str.startsWith("aa"));//Here we used lamda expresion also
			
		//displaying the long names
		/*
		 * if(longNames.count()==0) System.out.print("It is Empty"); else
		 */
			longNames.forEach(str->System.out.print(str+","));
		
	}

}
