import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

 class myRegex{
     static String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4]|[01]?[0-9]?[0-9])$";
 } 
class Solution{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}