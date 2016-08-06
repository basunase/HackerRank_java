import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


       

  

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = scan.nextInt();
        minmax(str, count);
    }
    
    static void minmax(String str, int num) {
        String min = str.substring(0, num);
        String max = str.substring(0, num);
        String compare;
        for (int x = 1; x+num <= str.length(); x++) {
            compare = str.substring(x, x+num);
            //System.err.println(compare);
            if (compare.compareTo(min) < 0)
                min = compare;
            if (compare.compareTo(max) > 0)
                max = compare;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
