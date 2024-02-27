	//Only one main() class may exist and execute. Its like a .exe and all the files it has access
	//no variables can be declare outside classes
	public static void main(String[] whatever) 
	{
		
	}
	
	
	//public/private/static/nonstatic are applicable to methods/variables (Classes do not use them)
	public class Smth
	//Public: means that this class is accesible for other methods outside this class.
	//Private: means that no other classes can access the field’s values, and only methods/classes of the same class are allowed 
	
	{
	//Data field: variables you declare within a class but outside of any method (commonly privated)
    private static int num = 5; //Static: all methods/classes share the same variable. Accesible by static and nonstatic 
	private int num1; //Nonstatic: each method/class has its own copy of this variable accesible for nonstatic alone
	
		//Methods are often static.
		public void aMethod()
		{
			System.out.println(num + 5);
		}
	
	
	
	}
}