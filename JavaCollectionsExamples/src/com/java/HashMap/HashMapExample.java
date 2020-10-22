package com.java.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
	        hm.put(100,"Amit"); 
	        hm.put(104,"Amit");   
	        hm.put(101,"Vijay"); 
	        hm.put(102,"Rahul"); 
	        hm.put(null,null); 
	        
	        //Before making value updated for key
	        System.out.println("-----------Before making value updated for key Hash map-----------"); 
	        for (Map.Entry m:hm.entrySet()) { 
	            System.out.println(m.getKey()+" "+m.getValue()); 
	        }
	        
	        hm.put(102,null); 
	        
	      //Afeter making value updated for key
	        System.out.println("-----------Afeter making value updated for key Hash map-----------"); 
	        for (Map.Entry m:hm.entrySet()) { 
	            System.out.println(m.getKey()+" "+m.getValue()); 
	        } 
	        
	}

}
