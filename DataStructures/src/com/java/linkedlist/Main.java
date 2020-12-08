package com.java.linkedlist;

/******************************************************************************

Online Java Compiler.
Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		int count = 1;
		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		Set<String> set = new HashSet<>();
        for (int i=0; i<t; i++) {
            set.add(pair_left[i] +" "+ pair_right[i]);
            System.out.println(set.size());
        }
		/*
		 * //for (int i = 0; i < t; i++) { for (int j = 1; j < t; j++) { //if (j <= t -
		 * 1) { if ((pair_left[0].equals(pair_left[j])) &&
		 * (pair_right[0].equals(pair_right[j]))) { count++; } else {
		 * System.out.println(count); }
		 * 
		 * 
		 * } else { System.out.println(count); }
		 * 
		 * } // } System.out.println(count);
		 */
	}
}
