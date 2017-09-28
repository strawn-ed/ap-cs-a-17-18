public class MascotRunner
{
    public static void main(String args[])
    {
        // create new Mascot object
        Mascot squirt = new Mascot(2018, "Squirt");
        
        /*
        * this line will fail -- cannot access classYear outside class
        * it is a private data member
        * System.out.println(squirt.classYear);
        */
        System.out.println(squirt.getYear());
        System.out.println(squirt.getName());
        System.out.println(squirt.cheer());
        System.out.println();
        
        // create another new Mascot object
        Mascot simba = new Mascot(2021, "Simba");
        System.out.println(simba.getYear());
        System.out.println(simba.getName());
        System.out.println(simba.cheer());
        System.out.println();
        
        System.out.println(squirt);
        System.out.println(simba);
    }
}