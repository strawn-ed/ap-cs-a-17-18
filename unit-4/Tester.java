public class Tester
{
	public static void main(String args[])
	{
		HighSchoolStudent frosh = new HighSchoolStudent("Lady Bird", "Troubadour", 9);
		System.out.println(frosh.getName());
		System.out.println(frosh.getMascot());
		System.out.println(frosh.getGradeLevel());
		
		Senior senior = new Senior("Lady Bird", "Troubadour", "Squirt");
		System.out.println(senior.getName());
		System.out.println(senior.getMascot());
		System.out.println(senior.getGradeLevel());
		System.out.println(senior.getClassMascot());
	}
}