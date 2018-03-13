public class Lesson39
{
	public static int rig(int n)
	{
		if (n == 0)
			return 5;
		else if (n == 1)
			return 8;
		else
			return rig(n-1) - rig(n-2);
	}
	
	public static int mm(int n)
	{
		if (n <= 0)
			return 10;
		else
			return n + mm(n-1);
	}
	
	public static int admrl(int n)
	{
		if (n <= 1)
			return n;
		else
			return n * admrl(n-2);
	}
	
	public static int bud(int n)
	{
		if (n > 5)
			return n - 2;
		else
			return n + bud(n+1);
	}
	
	public static int zing(int n)
	{
		if (n > 10)
			return n - 2;
		else
			n = n * 3;
			return n + zing(n+2);
	}
	
	public static void crch(int n)
	{
		if (n <= 0)
			System.out.print(n);
		else {
			crch(n / 3);
			System.out.print("," + n);
		}
	}
	
	public static void elvis(int n)
	{
		if (n <= 3)
			System.out.print(n+1);
		else {
			elvis(n-3);
			System.out.print(">>" + (n-1));
		}
	}
	
	public static int sal(int n)
	{
		if (n == 2)
			return 100;
		else if (n == 3)
			return 200;
		else
			return 2 * sal(n-1) + sal(n-2) + 1;
	}
	
	public static void puf(int n)
	{
		if (n == 1)
			System.out.print("x");
		else if (n % 2 == 0) {
			System.out.print("{");
			puf(n-1);
			System.out.print("}");
		}
		else {
			System.out.print("<");
			puf(n-1);
			System.out.print(">");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(rig(4));
		System.out.println(mm(6));
		System.out.println(admrl(5));
		System.out.println(bud(1));
		System.out.println(zing(0));
		crch(12);
		System.out.println();
		elvis(11);
		System.out.println();
		System.out.println(sal(5));
		puf(4);
		System.out.println();
	}
}