public class StudentRunner
{
    public static void main(String args[])
    {
        // create new Student object
        Student stu1 = new Student("SFHS", 2.6, 11);
        
        // examine data members/instance variables right after instantiation
        System.out.println(stu1.letterGrades);
        System.out.println(stu1.school);
        System.out.println(stu1.coffeePref);
        System.out.println(stu1.hoursOfSleep);
        System.out.println(stu1.stressLevel);
        System.out.println(stu1.numCredits);
        System.out.println(stu1.GPA);
        System.out.println(stu1.hoursOfHomework);
        System.out.println(stu1.worksHard);
        
        stu1.setCoffeePref("Tupelo");
        stu1.study(3);
        System.out.println(stu1.hoursOfSleep);
        System.out.println(stu1.stressLevel);
        while (stu1.stressLevel >= 1)
        {
            System.out.println("Watching Netflix...");
            stu1.watchNetflix();
        }
        System.out.println(stu1.stressLevel);
        
        String grades[] = { "A", "A+", "A" };
        System.out.println("Student grades");
        System.out.println("--------------");
        stu1.letterGrades = grades;
        for (String grade : grades)
            System.out.println(grade);
    }
}