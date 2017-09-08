public class ASCII
{
    public static void main(String args[])
    {
        /*
        int x = 48;
        // char zero = x;   // won't work! can't assign int to char since char < int
        char zero = (char) x;
        System.out.println(x);
        System.out.print((char) x);
        System.out.print("\t");
        System.out.println(zero);
        */
        String nineString = "9";
        char nineChar = nineString.charAt(0);
        // char nineChar = '9';     // same as line above
        int nineInt = nineChar;     // works to assign char to int since int > char
        System.out.println(nineChar);
        System.out.print((int) nineChar);
        System.out.print("\t");
        System.out.println(nineInt);
    }
}