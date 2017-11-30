public class ClassMethod
{
	private static int objectCount = 0;
	private int objectID;
	
	public ClassMethod(int id)
	{
		objectID = id;
		objectCount++;
	}
	
	public static void foo()
	{
		System.out.println("foo");
	}
	
	public static void main(String args[])
	{
		ClassMethod obj1 = new ClassMethod(8675309);
		System.out.println("Object #" + objectCount + " created of class ObjectCounter has id " + obj1.objectID + ".");
		obj1.foo();
		
		ClassMethod obj2 = new ClassMethod(221);
		System.out.println("Object #" + objectCount + " created of class ObjectCounter has id " + obj2.objectID + ".");
		obj2.foo();
		
		System.out.println("Total number of objects created: " + ClassMethod.objectCount);
		ClassMethod.foo();			/* compiles because foo is a static method */
	}
}