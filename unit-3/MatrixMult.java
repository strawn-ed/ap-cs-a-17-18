public class MatrixMult
{
    public static int[][] mult(int[][] m1, int[][] m2)
    {
        int[][] answer = new int[m1.length][m2[0].length];
        
        for (int i = 0; i < m2[0].length; i++)
        {
            for (int j = 0; j < m1.length; j++)
            {
                int sum = 0;
                for (int k = 0; k < m1[0].length; k++)
                {
                    sum += m1[j][k] * m2[k][i];
                }
                answer[j][i] = sum;
            }
        }
        
        return answer;
    }
    
    public static void main(String args[])
    {
        int[][] m1 = { { 1, 2, -2, 0 },
                       { -3, 4, 7, 2 },
                       { 6, 0, 3, 1 } };
        
        int[][] m2 = { { -1, 3 },
                       { 0, 9 },
                       { 1, -11 },
                       { 4, -5 } };
                       
        int[][] answer = mult(m1, m2);
                       
        for (int row = 0; row < answer.length; row++)
        {
            for (int column = 0; column < answer[row].length; column++)
            {
                System.out.print(answer[row][column] + "\t");
            }
            System.out.println();
        }
    }
}