import java.util.*;

public class FibonacciBetter {

	private static Map<Long, Long> fiboHelper;
	
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
			// calculate answer once and store in map --> memoization / dynamic programming
			if (!fiboHelper.containsKey(num-1))
			{
				fiboHelper.put(num-1, fibo(num-1));
			}
			else if (!fiboHelper.containsKey(num-2))
			{
				fiboHelper.put(num-2, fibo(num-2));
			}
			
			fiboHelper.put(num, fiboHelper.get(num-1) + fiboHelper.get(num-2));
			
			return fiboHelper.get(num-1) + fiboHelper.get(num-2);
		}
	}
	
	public static void main(String args[]) {
		fiboHelper = new HashMap<>();
		// adding 'L' to an integer allows it to be autoboxed as a Long
		fiboHelper.put(1L, 0L);
		fiboHelper.put(2L, 1L);
		System.out.println(fibo(93));
		
		// System.out.println(fiboHelper);
		for (Map.Entry<Long, Long> entry : fiboHelper.entrySet())
		{
		    System.out.println("Fibonacci Number #" + entry.getKey() + ": " + entry.getValue());
		}
	}
}