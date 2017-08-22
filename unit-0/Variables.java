public class Variables
{
    public static void main(String args[])
    {
        // prefix notation
        int i = 10;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();
        
        // postfix notation
        i = 10;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();
        
        // i = 11; j = 10
        System.out.println(i > j);
        System.out.println();
        
        /*
        /   since the first half of AND is false, the evaluation "short-circuits" and the second half never executes
        /   we know this because if it did, j would be incremented to 11
        */
        System.out.println((i == j) && (i > ++j));
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();
        
        /*
        /   since the first half of OR is true, the evaluation "short-circuits" and the second half never executes
        /   we know this because if it did, j would be incremented to 11
        */
        System.out.println((i > j) || (i > ++j));
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();
        
        /*
        /   since incrementing j is part of the comparison as prefix, its value does change before the comparison
        /   we know this because j now holds the value 11 and the comparison is false
        */
        System.out.println(i > ++j);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();
        
        /*
        /   since incrementing j is part of the comparison as postfix, its value does change but only after the comparison
        /   we know this because it is true that i (11) equals j (11), yet j is now 12
        */
        System.out.println(i == j++);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}