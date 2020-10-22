package com.java.HashTable;
import java.util.*; 
public class HashTableExample {

	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>(); 

		// enter name/marks pair 
		marks.put("tweener", new Integer(345)); 
		marks.put("krantz", new Integer(100)); 
		marks.put("burrows", new Integer(790)); 
		marks.put("tancredi", new Integer(800)); 
		marks.put("bellick", new Integer(435)); 
		marks.put("null", new Integer(435)); 
		marks.put("null", new Integer(435)); 

		// check whether a value exists or not 
		if (marks.containsKey("null")) 
			System.out.println("Key found in table"); 
		else
			System.out.println("Key not found in table"); 
		
		 // check whether a value exists or not 
        if (marks.containsValue(100)) 
            System.out.println("value found in table"); 
        else
        	System.out.println("value not found in table");
        
        // printing Hastable entries 
        System.out.println("HashTable entries: " + marks); 
        
        // creating set view for hash table 
        Set s = marks.entrySet(); 
  
        // printing set entries 
        System.out.println("set entries: " + s); 
	} 
}