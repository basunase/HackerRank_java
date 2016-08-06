import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer str = new StringBuffer(A);
        str.reverse();
        String B = str.toString();
        if (B.equals(A)){
        System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
