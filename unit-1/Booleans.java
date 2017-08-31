public class Booleans
{
    public static void main(String args[])
    {
        // truth table for && (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println();
        
        // truth table for || (OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println();
        
        // truth table for ! (NOT)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println();
        
        // operator precedence
        System.out.println(true || false && false);
        System.out.println(true && false || false);
    }
}