import java.io.*;
import java.util.*;

public class prob02
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("prob02.txt");
		Scanner readIn = new Scanner(inFile);
		int m = readIn.nextInt();
		int v = readIn.nextInt();
		
		System.out.println(m * v);
	}
}