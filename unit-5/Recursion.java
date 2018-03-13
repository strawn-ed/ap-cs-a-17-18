public class Recursion {
	
	public static int fact(int num) {
		// base case
		if (num <= 1)
		{
			System.out.println(num);
			return 1;
		}
		// recursive case
		else
		{
			System.out.print(num + " * ");
			return num * fact(num - 1);
		}
	}
	
	public static void main(String args[]) {
		System.out.println(fact(15));
	}
}