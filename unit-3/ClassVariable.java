public class ClassVariable
{
	private static int objectCount = 0;
	private int objectID;
	
	public ClassVariable(int id)
	{
		objectID = id;
		objectCount++;
	}
	
	public static void main(String args[])
	{
		ClassVariable obj1 = new ClassVariable(8675309);
		System.out.println("Object #" + objectCount + " created of class ObjectCounter has id " + obj1.objectID + ".");
		
		ClassVariable obj2 = new ClassVariable(221);
		System.out.println("Object #" + objectCount + " created of class ObjectCounter has id " + obj2.objectID + ".");
		
		System.out.println("Total number of objects created: " + ClassVariable.objectCount);
	}
}