package javaexamples;

public class StringLettersReverseNotSpecialCharacters {
    public static void reverse(char ch[]) 
    { 
        // Initialize left and right pointers 
        int r = ch.length - 1, l = 0; 
  
        // Traverse string from both ends until 
        // 'l' and 'r' 
        while (l < r) 
        { 
            // Ignore special characters 
            if (!Character.isAlphabetic(ch[l])) 
                l++; 
            else if(!Character.isAlphabetic(ch[r])) 
                r--; 
  
            // Both ch[l] and ch[r] are not spacial 
            else 
            { 
                char tmp = ch[l]; 
                ch[l] = ch[r]; 
                ch[r] = tmp; 
                l++; 
                r--; 
            } 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String str = "abc!#$"; 
        char[] charArray = str.toCharArray(); 
  
        System.out.println("Input string: " + str); 
         reverse(charArray);
         String revStr = new String(charArray); //converting character array to string
        System.out.println("Output string: " + revStr); 
    } 
} 
  
