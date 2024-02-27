	//Instance methods and the variables that they have accesss to conform objects these methods (Object methods)
/*
* classes provide a way to classify and organize related methods and variables, and to define the properties and 
 * behaviors of objects, but they are not part of the objects themselves.
 * 
 * Creating instance methods in a class means defining methods within the class that can be used by objects created 
 * from that class. These instance methods can be used to perform specific actions or behaviors that are unique to each object,
 * that is, use the same method several times without altering the result in other calls.
 * 
 * A static method would change the value of the static variables, thus affenting the other static methods.
 * 
 * So, it is possible to create objects that have methods from different classes, as long as those methods are 
 * accessible to the object. However, it is common to use methods from the same class when creating objects, as this 
 * helps to maintain a clear and organized code structure.
 *
 * Nonstatic methods are for objects, which are used for specific functionalities
 * Static methods are used for general functionalities that affect all objects alike
 * 
 * To help you determine whether a data field should be static, you can ask yourself how many times it occurs. If it occurs once 
 * per class, it is static, but if it occurs once per object, it is not static
 */
//-----------------------------------------------------------------------------------------------------------------------------------
	
	
	public static void main(String[] whatever) 
	{
		
	}
	
	//Here I'll place all methods related to employees
	public class Employee
	{
		//Data field
		private int empNum;
		private String empFirstName;
		//Data field
		
//------------------------------------------------
		
		public int getEmpNum()
		{
			return empNum;
		}	
		public void setEmpNum(int emp)
		{
			empNum = emp;
		}
//********************************************
		public String getFirstName()
		{
			return empFirstName;
		}	
		public void getFirstName(String name)
		{
			empFirstName = name;
		}	
}




//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
 * Objects are instances of a class, which is a blueprint that defines the properties and behaviors of the object.
 *
 * When you create an object from a class, the object will have its own copy of the instance variables and can execute its own instance methods, as defined by the class.
 * 
 * Instance methods are methods that belong to an object of a class. They can access and modify the instance variables of a class, which are variables that are unique to each object.
 * 
 * Instance methods are defined using the public, private, or protected access modifiers, followed by the void, int, String, or any other return type, and finally the method name.
 * 
 * Instance methods are always non-static and cannot be called directly from the class itself. Instead, they must be called on an object instance.
 * 
 * Static methods are methods that belong to the class itself, rather than to any instance of the class. They can be called directly from the class and can access and modify static variables, which are variables that are shared by all objects of a class.
 * 
 * Objects can use methods from any class, as long as the class is in the object's classpath and the object has access to the methods through an object reference or a class reference.
 * 
 * It is possible to create objects that have methods from different classes, as long as those methods are accessible to the object. However, it is common to use methods from the same class when creating objects, as this helps to maintain a clear and organized code structure.
 */