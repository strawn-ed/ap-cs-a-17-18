import java.io.*;
import java.util.*;

public class prob01
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("prob02.txt");
		Scanner readIn = new Scanner(inFile);
		String name = readIn.next();
		
		System.out.println("Salutations, " + name + "! We are the Fighting Sandcrabs from Port Lavaca HS!");
	}
}