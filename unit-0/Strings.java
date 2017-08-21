public class Strings
{
    public static void main(String args[])
    {
        // declare variables for use with string methods
        String bookTitleOne = "Blue Pelican Java";
        String bookTitleTwo = "Think Java";
        int BPJVersion = 3;
        
        // get length of each string
        System.out.println(bookTitleOne.length());
        System.out.println(bookTitleTwo.length());
        
        // grab substrings of each string
        System.out.println(bookTitleOne.substring(5));
        System.out.println(bookTitleTwo.substring(0,5));
        
        // convert entire strings to lower/upper case (respectively)
        System.out.println(bookTitleOne.toLowerCase());
        System.out.println(bookTitleTwo.toUpperCase());
        
        // concatenate two strings
        System.out.println(bookTitleOne + " " + bookTitleTwo);
        
        // concatenate string and number
        System.out.println(bookTitleOne + BPJVersion);
        
        // Use escape sequences for new line, backslash, and tab
        System.out.println("This\nis\nAP\tCS\tA \\ Java Programming");
    }
}