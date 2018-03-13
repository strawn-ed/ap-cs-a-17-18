public class Fibonacci {

	public static long fibo(long num) {
		// base cases
		if (num == 1)
		{
			return 0;
		}
		else if (num == 2)
		{
			return 1;
		}
		// recursive case
		else
		{
			return fibo(num-1) + fibo(num-2);
		}
	}
	
	public static void main(String args[]) {
		System.out.println(fibo(55));
	}
}