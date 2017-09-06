import java.io.*;
import java.util.*;

public class PlanetWeight
{
    public static void main(String args[])
    {
        Scanner readIn = new Scanner(System.in);
        System.out.print("What is your weight on Earth? ");
        double userWeight = readIn.nextDouble();
        
        System.out.println();
        System.out.println("1. Voltar");
        System.out.println("2. Krypton");
        System.out.println("3. Fertos");
        System.out.println("4. Servontos");
        System.out.println();
        
        System.out.print("\tSelection? ");
        int planetChoice = readIn.nextInt();
        System.out.println();
        
        switch (planetChoice)
        {
            case 1:
                userWeight *= 0.091;
                System.out.println("Your weight on Voltar would be " + userWeight);
                break;
            case 2:
                userWeight *= 0.720;
                System.out.println("Your weight on Krypton would be " + userWeight);
                break;
            case 3:
                userWeight *= 0.865;
                System.out.println("Your weight on Fertos would be " + userWeight);
                break;
            case 4:
                userWeight *= 4.612;
                System.out.println("Your weight on Servontos would be " + userWeight);
                break;
            default:
                System.out.println("No.");
                break;
        }
    }
}