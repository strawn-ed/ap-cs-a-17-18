public class Student
{
    // data members/instance variables
    // only made public for the purposes of showing initialization via StudentRunner
    public String letterGrades[];
    public String school;
    public String coffeePref;
    public int hoursOfSleep = 5;
    public int stressLevel = -1;
    public int numCredits;
    public double GPA;
    public double hoursOfHomework;
    public boolean worksHard = true;
    
    // constructor
    public Student(String school, double GPA, int stress)
    {
        this.school = school;
        this.GPA = GPA;
        this.stressLevel = stress;
    }
    
    // methods -- void methods don't return anything
    // mutator method (setter method)
    public void setCoffeePref(String coffeeShop)
    {
        this.coffeePref = coffeeShop;
    }
    
    // mutator method (setter method)
    public void setLetterGrades(String grades[])
    {
        this.letterGrades = grades;
    }
    
    // void method
    public void study(int hours)
    {
        this.hoursOfSleep -= hours;
        this.stressLevel++;
    }
    
    // void method
    public void watchNetflix()
    {
        this.stressLevel--;
    }
}