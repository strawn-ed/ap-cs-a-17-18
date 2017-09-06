public class Lessons11And12Unquiz
{
    public static void main(String args[])
    {
        // for #1
        int sum = 0;
        for (int k = 0; k < 5; k++) {
            sum += k;
        }
        System.out.println("for #1: " + sum);
        
        // for #2
        double kk = 3;
        int j = 0;
        for (j = 0; j <= 100; j++) {
            kk = kk + Math.pow(j, 2);
            ++kk;
        }
        System.out.println("for #2: " + j);
        
        // for #3
        double p = 0;
        for (int m = 10; m > 6; --m)
        {
            if (m == 7) {
                p = p + m;
            } else {
                ++p;
            }
        }
        System.out.println("for #3: " + p);
        
        // for #5 
        /* infinite loop
        double x = 0;
        for (int b = 0; b < 101; b++)
        {
            x = x + 1;
            b--;
        }
        System.out.println("for #5: " + x);
        */
        
        // for #6 
        int c, d = 5;
        for (c = 0; c < 5; c++);
            d = d + 1;
        System.out.print("for #6: ");
        System.out.println(c + " " + d);
        
        // for #7
        int f, g;
        int count = 0;
        for (f = 0; f < 4; f++)
        {
            for (g = 0; g < 10; g++)
            {
                count++;
            }
        }
        System.out.print("for #7: " + count--);
        System.out.println(count);
        
        // while / do-while #2
        /* infinite loop
        int z = 19;
        while (z < 20)
        {
            if (z < 100)
                continue;
            z++;
        }
        */

        // while / do-while #3
        int d2 = 0, e = 0;
        do {
            if (d2 == 1)
            {
                e += 3;
            }
            d2++;
            e--;
        } while (d2 < 3);
        System.out.println("while / do-while #3: " + e);
        
        // while / do-while #4
        boolean p2 = true, a2 = false;
        int sum2 = 0;
        while (p2)
        {
            sum2 += 5;
            if (a2 || !a2)
                break;
        }
        System.out.println("while / do-while #4: " + sum2);
    }
}