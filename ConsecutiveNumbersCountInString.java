
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//converting number to binary and count consecutive 1's in binary number
public class ConsecutiveNumbersCountInString {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter a Integer");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binaryString = Integer.toBinaryString(n);
        System.out.println("Binary number for "+n+" is "+binaryString);
      int consecutive=1;
     ArrayList<Integer> al = new ArrayList<Integer>(); 
       for(int i = 0; i < binaryString.length()-1 ;i++)
    {
        char charAtPos = binaryString.charAt(i);
        char charAtNextPos = binaryString.charAt(i+1);
        if (charAtPos == '1')
        {
            if (charAtPos == charAtNextPos)
            {
                consecutive += 1;
                al.add(consecutive);
            }
        }
        else
        {
            al.add(consecutive);
            consecutive=1;
        }
    }
    Collections.sort(al, Collections.reverseOrder()); 
       System.out.println("Consecutive ones in binary number is "+ al.get(0));
        scanner.close();
    }
}
