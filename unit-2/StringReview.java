public class StringReview
{
    public static void main(String args[])
    {
        // 4 ways to create a String object
        String name = "Sherlock";
        String otherName = new String("Watson");
        String emptyString = new String();
        String dangerString;
        dangerString = "Moriarty";
        
        // String concatenation
        System.out.println(name + otherName);
        
        // Strings are immutable
        otherName = "Mycroft";

        // String methods for the AP Exam 
        // int length();
        System.out.println(name.length());
        int nameLength = otherName.length();
        
        // String substring(int from); *NOTE: substring() is an overloaded method*
        String sub1 = "Benjamin".substring(3);
        System.out.println(sub1);
        
        // String substring(int from, int to); *NOTE: substring() is an overloaded method*
        String sub2 = "Benjamin".substring(3, 6);
        System.out.println(sub2);
        
        // int indexOf(String str);
        int indexOfJ = "Benjamin".indexOf("J");
        System.out.println(indexOfJ);
        
        // int compareTo(String other);
        int val1 = "Benjamin".compareTo("Samuel");
        int val2 = "Samuel".compareTo("Benjamin");
        int val3 = "Toby".compareTo("Toby");
        int val4 = "Sam".compareTo("Samuel");
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        
        // String comparison: == v. equals()
        // == is only guaranteed to work for primitive types (char, int, double, boolean)
        
        // boolean equals(String other);
        boolean same = "Samuel".equals("Samuel");
        boolean notSame = "Samuel".equals("Ben");
        System.out.println(same);
        System.out.println(notSame);
        System.out.println(same == notSame);
        
        // String traversal
        for (int i = 0; i < name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }
    }
}