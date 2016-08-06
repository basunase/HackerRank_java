import java.io.*;
import java.util.*;

public class Solution {
        static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        if (a.length() != b.length())
             return false;
        else{
            
             char[] str = a.toLowerCase().toCharArray();;
             char[] str1 = b.toLowerCase().toCharArray();
            Arrays.sort(str);
            Arrays.sort(str1);
            return Arrays.equals(str,str1);
        }
       
    }
      
        public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}