
import java.util.*;

public class BinaryNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter a Number");
        int n = scanner.nextInt();
        int count=1;
      String bi=Integer.toBinaryString(n);
      char ch[]=bi.toCharArray();
      ArrayList<Integer> al=new ArrayList<Integer>();
      //System.out.println(ch.length-1);
      for(int i=0;i<ch.length-1;i++)
      {
          if(ch[i]=='1' && ch[i+1]=='1')
          {
              count++;
            al.add(count);
          }
          else
          {
              al.add(count);
              count=1;
          }
      }
      Collections.sort(al, Collections.reverseOrder());
      System.out.println(n+" Binary number is:"+bi+" and maximun number of consecutive 1's are "+al.get(0)+" in binary number");
        scanner.close();
    }
}
