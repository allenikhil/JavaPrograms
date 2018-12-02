package LeargeCodePgms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RangeNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter a number");
        int N = scanner.nextInt();
        if(N%2==0)
        {
           if(N<5 || N>20) 
           {
               System.out.println("Not weird");
           }
            else
            {
                System.out.println("weird");
            }
        }
        else
        {
           System.out.println("weird"); 
        }
         scanner.close();
    }
}
