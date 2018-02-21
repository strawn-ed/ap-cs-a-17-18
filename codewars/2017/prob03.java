import java.io.*;
import java.util.*;

public class prob03
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("prob03.txt");
		Scanner readIn = new Scanner(inFile);
		
		while (readIn.hasNextLine())
		{
			double time = readIn.nextDouble();
			System.out.println(time * 0.299792);
		}
	}
}