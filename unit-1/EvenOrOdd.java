import java.io.*;
import java.util.*;

public class EvenOrOdd
{
    public static void main(String args[])
    {
        Scanner readIn = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        int userInteger = readIn.nextInt();
        boolean userIntegerIsEven = (userInteger % 2 == 0);
        
        if (userIntegerIsEven)
        {
            System.out.println("The integer " + userInteger + " is even.");
        }
        else
        {
            System.out.println("The integer " + userInteger + " is odd.");
        }
    }
}