package javaexamples;

public class SecondLargestNumberInArray{  
public static int getSecondLargest(int[] a){  
int temp;  
int size=a.length;
for (int i = 0; i < size; i++)   
        {  
            for (int j = i + 1; j < size; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[size-2];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Second Largest: "+getSecondLargest(a));  
System.out.println("Second Largest: "+getSecondLargest(b));  
}}