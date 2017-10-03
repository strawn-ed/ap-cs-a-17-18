import java.io.*;
import java.util.*;

public class TemperatureBad
{
    public static void main(String args[])
    {
        // get temp in C from user
        Scanner readIn = new Scanner(System.in);
        System.out.print("C: ");
        double userTemp = readIn.nextDouble();
    
        // convert and print temp in F
        System.out.printf("F: %.1f\n", userTemp * 9 / 5 + 32);
    }
}