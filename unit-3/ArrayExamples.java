public class ArrayExamples
{
    public static void main(String[] args)
    {
        // C-style array declaration
        int scores_in_C[] = { 95, 87, 92, 100 };
        
        // Java-style array declaration
        // method 1
        int[] scores_in_Java = { 95, 87, 92, 100 };
        
        // method 2
        int[] scores_in_Java2 = new int[] { 95, 87, 92, 100 };
        
        // method 3
        int[] scores_in_Java3 = new int[4];     // initializes all elements to 0
        scores_in_Java3[0] = 95;
        scores_in_Java3[1] = 87;
        scores_in_Java3[2] = 92;
        scores_in_Java3[3] = 100;
        // scores_in_Java3[4] = 77;     // throws ArrayIndexOutOfBoundsException
        
        // C-style iteration over an array
        System.out.println(scores_in_C.length);
        for (int i = 0; i < scores_in_C.length; i++)
        {
            System.out.println(scores_in_C[i]);
        }
        
        // Java-style iteration over an array
        // similar to Python's `for num in nums` approach
        int sum = 0;
        for (int num : scores_in_Java)
        {
            sum += num;
        }
        System.out.println((float) sum / scores_in_Java.length);
    }
}