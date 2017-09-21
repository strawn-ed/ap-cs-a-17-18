public class TableOfBases
{
    public static void main(String args[])
    {
        System.out.print("Decimal");
        System.out.print("\t");
        System.out.print("Binary");
        System.out.print("\t\t");
        System.out.print("Octal");
        System.out.print("\t");
        System.out.print("Hex");
        System.out.print("\t");
        System.out.print("ASCII");
        System.out.println();
        
        // for (int i = 65; i <= 90; i++)
        int i = 65;
        while (i <= 90)
        {
            System.out.print(i);
            System.out.print("\t");
            System.out.print(Integer.toBinaryString(i));
            System.out.print("\t\t");
            System.out.print(Integer.toOctalString(i));
            System.out.print("\t");
            System.out.print(Integer.toHexString(i));
            System.out.print("\t");
            System.out.print((char) i);
            System.out.println();
            i++;
        }
    }
}