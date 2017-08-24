import java.io.*;
import java.util.*;

public class ScannerDemo
{
    public static void main(String args[])
    {
        // create new Scanner object
        Scanner readIn = new Scanner(System.in);
        
        // prompt user then read in value
        System.out.print("Enter an int: ");
        int myInt = readIn.nextInt();
        
        // prompt user then read in value
        System.out.print("Enter a double: ");
        double myDouble = readIn.nextDouble();
        
        // prompt user then read in value
        System.out.print("Enter a word: ");
        String myWord = readIn.next();
        
        // create a new object in order to now read in a whole line
        Scanner readInLine = new Scanner(System.in);
        
        // prompt user then read in value
        System.out.print("Enter a phrase: ");
        String myPhrase = readInLine.nextLine();
        
        // print out user input
        System.out.println("You entered: " + myInt + ", " + myDouble + ", and " + myWord + ".");
        System.out.println("You also entered the phrase: " + myPhrase + ".");
    }
}