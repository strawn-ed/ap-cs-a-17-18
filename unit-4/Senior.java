public class Senior extends HighSchoolStudent
{
	private String classMascot;
	
	public Senior(String name, String mascot, String classMascot)
	{
		super(name, mascot, 12);
		this.classMascot = classMascot;
	}
	
	public String getClassMascot()
	{
		return this.classMascot;
	}
	
	@Override
	public String getMascot()
	{
		return super.getMascot() + " (from superclass)";
	}
}