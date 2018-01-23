public class HighSchoolStudent
{
	private String name;
	private String schoolMascot;
	private int gradeLevel;
	
	public HighSchoolStudent(String name, String mascot, int grade)
	{
		this.name = name;
		this.schoolMascot = mascot;
		this.gradeLevel = grade;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getMascot()
	{
		return this.schoolMascot;
	}
	
	public int getGradeLevel()
	{
		return this.gradeLevel;
	}
}