public class Arrays2D
{
    public static void main(String args[])
    {
        // declare and initialize 2D array using { } notation
        int[][] m1 = { { 1, 2, 3 },
                       { 4, 5, 6 },
                       { 7, 8, 9 } };
                       
        System.out.println("m1: ");               
        for (int row = 0; row < m1.length; row++)
        {
            for (int column = 0; column < m1[row].length; column++)
            {
                System.out.print(m1[row][column] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nm2: "); 
        int[][] m2 = new int[3][3];         // `new int[3][]` also works   
        // m2[0] = { 1, 2, 3 };             /* does not compile */
        m2[0] = new int[] { 1, 2, 3 };
        m2[1] = new int[] { 4, 5, 6 };
        m2[2] = new int[] { 7, 8, 9 };
        
        // m2[0] = { 10, 11, 12 };          /* does not compile */
        int[] replacement = { 10, 11, 12 };
        m2[0] = replacement;
        
        for (int row = 0; row < m2.length; row++)
        {
            for (int column = 0; column < m2[row].length; column++)
            {
                System.out.print(m2[row][column] + "\t");
            }
            System.out.println();
        }
    }
}