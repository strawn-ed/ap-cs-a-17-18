public class Lesson10
{
    public static void main(String args[])
    {
        // Exercise #2
        int x = 3, p = 5, y = -8;
        switch (x)
        {
            case 2:
                p++;
            case 3:
            case 4:
                y+=(--p);   // y = y + (--p); y = -8 + (--5) = -8 + (4)
                break;
            case 5:
                y+=(p++);   // y = y + (p++)
        }
        System.out.println(y);  // 2, 2, 1?, -4
        
        // Exercise #4
        String s = "Green";
        int q = 0;
        switch (s)
        {
            case "Red":
                q++;
            case "Green":
                q++; // 1
            case "Blue":
                q++; // 2
            case "Yellow":
                q++; // 3
            default:
                q++; // 4
        }
        System.out.println(q); // 4
        System.out.println(--q); // 3
        System.out.println(q--); // 3
        System.out.println(q); // 2 
        
        // Exercise #6
        int a = 10, b = 12;
        System.out.println("The sum is " + a + b);      // "The sum is 1012"
        System.out.println("The sum is " + (a + b));    // "The sum is 22"
        
        // Exercise #9
        String s1 = "X";
        char chr = s1.charAt(0);
        System.out.println(chr);
    }
}