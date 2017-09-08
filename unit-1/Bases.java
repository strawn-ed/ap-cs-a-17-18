public class Bases
{
    public static void main(String args[])
    {
        /*
        // store and print number in hex
        int x_hex = 0x42;
        System.out.println(x_hex);
        
        // store and print number in bin
        int x_bin = 0b101010;
        System.out.println(x_bin);
        
        // store and print number in oct
        int x_oct = 042;
        System.out.println(x_oct);
        
        // store and print number in dec
        int x_dec = 42;
        System.out.println(x_dec);
        */
        int sherlock = 221;
        System.out.println(Integer.toHexString(sherlock));
        System.out.println(Integer.toBinaryString(sherlock));
        System.out.println(Integer.toOctalString(sherlock));
        System.out.println(Integer.toString(sherlock, 13));
    }
}