	//Only one main() class may exist and execute. Its like a .exe and all the files it has access
	//no variables can be declare outside classes
	public static void main(String[] whatever) 
	{
		
	}
	
	
	//public/private/static/nonstatic are appliable to classes/methods/variables
	public class Smth
	//Public: means that this class is accesible for other methods outside this class.
	//Private: means that no other classes can access the field’s values, and only methods of the same class are allowed 
	
	{
	//Data field: variables you declare within a class but outside of any method (commonly privated)
    int num = 5; //Nonstatic: all methods/classes share the same variable
	static int num1; //Static: each method/class has its own copy of this variable
	
	
		public void aMethod()
		{
			System.out.println(num + 5);
		}
	
	
	
	}
}