//The main class is the base class, the one that inherits is called derived class// SubClass and SuperClass are also common names
//Is not the same a class that "has" a class, than a class that "is" of a certain class type, like a class Tree is a Plant
//If a superClass ceases to exist, the subclasses would not exist either.

public static void main(String[]args)
	{
		Professor Jhon = new Professor();	//In this declaration Professor objects has access to all data fields of Employee class
		Jhon.setId(12);		//Professor objects also has access to Employee methods, it is, as the word used, an extension of the main class
	}
	
	public static class Employee 
	{
		private int id;
		private String name;
		private int salary;
//------------------------------------
		Employee()
		{
			id = 0;
			name = "";
			salary = 0;
			
		}
		public  void setId(int id)
		{
			this.id = id;
		}
		
	}
//-------------------------------------
	public static class Professor extends Employee //extends makes Professor receive the methods and datafiels of the 
													//Employee Superclass, enabling the use of these for this class objects
	{
		private int classNumber;					//From here on you can add more methods and datafields but they will only be 
													//accesible for this class' objects
		Professor()
		{
			classNumber = 0;
		}
		
	}