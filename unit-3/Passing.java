public class Passing
{
    public static void double_val(int val)
    {
        val *= 2;
        System.out.println(val);
    }
    
    public static void change_first_letter(String str)
    {
        str = "X" + str.substring(1);
        System.out.println(str);
    }
    
    public static void double_array(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] *= 2;
        }
    }
    
    public static void main(String args[])
    {
        int answer_to_life = 42;
        double_val(answer_to_life);
        System.out.println(answer_to_life);
        
        String name = "John Mayer";
        change_first_letter(name);
        System.out.println(name);
        
        int my_array[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < my_array.length; i++)
        {
            System.out.println(my_array[i]);
        }
        System.out.println("Doubling...");
        double_array(my_array);
        for (int i = 0; i < my_array.length; i++)
        {
            System.out.println(my_array[i]);
        }
    }
}