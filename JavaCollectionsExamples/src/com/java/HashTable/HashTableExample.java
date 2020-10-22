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
		marks.put("null", new Integer(436)); 

		// provide value for new key which is absent 
				// using computeIfAbsent method 
		marks.computeIfAbsent("Pen", k -> 600); 
		marks.computeIfAbsent("Book", k -> 800); 

				// print new mapping 
				System.out.println("new hashTable: "
								+ marks); 
				
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
        
        
        Hashtable<String, Integer> marks1 = (Hashtable<String, Integer>) marks.clone(); 

		 // checking whether both hash tables  
        // are equal or not 
        if (marks.equals(marks1)) 
            System.out.println("both hash tables are equal");
        else
        	System.out.println("both hash tables are Not equal");
        
        // printing Hastable entries 
        //System.out.println("HashTable entries: " + marks); 
        //System.out.println("HashTable entries: " + marks1); 
        
        HashMap<String,Integer> hm=new HashMap<String,Integer>(); 
        hm.put("tweener", new Integer(345)); 
		hm.put("krantz", new Integer(100)); 
		hm.put("burrows", new Integer(790)); 
		hm.put("tancredi", new Integer(800)); 
		hm.put("bellick", new Integer(435)); 
		hm.put("null", new Integer(435)); 
		hm.put("null", new Integer(436)); 
        
        // checking whether  both hash table and Hashmap   
        // are equal or not 
        if (marks1.equals(hm)) 
            System.out.println("both hash table and Hashmap are equal");
        else
        	System.out.println("both are hash table and Hashmap  Not equal");
        
	} 
}