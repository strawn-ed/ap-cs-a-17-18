public class TemperatureRunner
{
    public static void main(String args[])
    {
        Temperature hotDay = new Temperature("F", 101);
        System.out.println(hotDay.getScale());
        System.out.println(hotDay.getTemp() + " F");
        System.out.printf("%.2f C\n", hotDay.fToC());
        
        System.out.println();
        
        Temperature coldDay = new Temperature("C", -10);
        System.out.println(coldDay.getScale());
        System.out.println(coldDay.getTemp() + " C");
        System.out.printf("%.2f F\n", coldDay.cToF());
        
        /*        
        System.out.println();

        System.out.println(hotDay);
        System.out.println(coldDay);
        
        System.out.println();
        
        coldDay = hotDay;
        System.out.println(hotDay);
        System.out.println(coldDay);
        */
    }
}