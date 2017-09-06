import java.io.*;
import java.util.*;

public class Booleans
{
    public static void main(String args[])
    {
        // create Scanner for use later
        Scanner readIn = new Scanner(System.in);
        
        boolean truthValue = true;
        
        // truth table for && (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println();
        
        // truth table for || (OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println();
        
        // truth table for ! (NOT)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println();
        
        // comparison for booleans v. for strings
        System.out.println(true == true);
        System.out.println(true == false);
        
        String a = "hello";
        System.out.print("Type the word \"hello\": ");
        String b = readIn.next();
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println();
        
        // operator precedence
        System.out.println(true || false && false);
        System.out.println(true && false || false);
    }
}