package containers;
import java.util.*;  
class ArrayList1{  
   public static void main(String args[]){  
      ArrayList alist=new ArrayList();  
      alist.add(45);
      alist.add(57);
      alist.add(64);
      alist.add(72);
      alist.add(88);
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(2,99);
  
      //displaying elements
      System.out.println(alist);
      System.out.println(alist.isEmpty());
      System.out.println(alist.isEmpty());
      Collections.sort(alist);
      System.out.println(alist);
   }  
}
