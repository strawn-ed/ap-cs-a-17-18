public class Mascot
{
    // data members of Mascot class -- always private
    private int classYear;
    private String name;
    
    // constructor for Mascot class -- same name as class
    // key purposes: create instance of class and set data members
    public Mascot(int year, String name)
    {
        this.classYear = year;
        // name = name;         this line won't work -- which name is which?
        this.name = name;
    }
    
    // accessor method for classYear variable (getter method)
    public int getYear()
    {
        return classYear;
    }
    
    // accessor method for name variable
    public String getName()
    {
        return name;
    }
    
    // method to generate a cheer -- notice no printing
    // value returned instead of being printed
    // key principle for the exam -- no side effects
    public String cheer()
    {
        if (classYear == 2018)
        {
            String partOne = "S-S-S-E-N-I-I-I-O-R\n";
            String partTwo = "S-E-N-I-O-R\n";
            String partThree = "GO SENIORS!";
            return partOne + partTwo + partThree;
        }
        
        return "No cheers yet -- sorry :(";
    }
}