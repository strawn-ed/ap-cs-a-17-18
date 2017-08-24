import java.io.*;
import java.util.*;

public class ScannerClassDemo
{
    public static void main(String args[])
    {
        // create an instance of Scanner class
        // otherwise known as a Scanner object
        // calling this object readIn
        // object of type Scanner
        Scanner readIn = new Scanner(System.in);
        
        System.out.print("Enter your zodiac sign: ");
        String zodSign = readIn.next();
        System.out.println("You were born under " + zodSign + ".");
        /*
        System.out.print("Enter your area code: ");
        int areaCode = readIn.nextInt();
        System.out.println("You are from the " + areaCode + ".");
        
        System.out.print("Enter your bank balance: ");
        double treatYoSelf = readIn.nextDouble();
        System.out.println("I now have $" + treatYoSelf + " at my disposal.");
        */
        Scanner readInLine = new Scanner(System.in);
        
        System.out.print("Enter your senior quote: ");
        String senQuote = readInLine.nextLine();
        System.out.println(senQuote);
    }
}