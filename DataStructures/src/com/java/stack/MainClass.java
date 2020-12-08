/**
 * 
 */
package com.java.stack;

/**
 * @author Nikhil
 *
 */
public class MainClass {
	public static void main(String[] args) {
		Stack list=new Stack();
		System.out.println("===Normal Array===");
		list.push(2);
		list.push(12);
		list.push(8);
		list.push(10);
		list.push(50);
		list.show();
		list.push(60);
		list.show();
		list.pop();
		list.show();
		
		System.out.println("===Dynamic Array===");
		DynamicStack dList=new DynamicStack();
		dList.push(2);
		dList.push(12);
		dList.push(8);
		dList.push(10);
		dList.push(50);
		dList.show();
		dList.push(60);
		dList.show();
		dList.pop();
		dList.show();
		dList.pop();
		dList.show();
		dList.pop();
		dList.show();
		dList.pop();
		dList.show();
		dList.pop();
		dList.show();
		
	}

}
