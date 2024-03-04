	public static void main(String[]whatever)
	//Classes to objects are basically datatypes.
	//Objects can be processed as int or doubles are, being send between methods, using their class as datatypes in the parameters, etc.
	{
		//Scanner
		Scanner input = new Scanner(System.in);
		String name;
		

		//Declaration of objects
		Employee pilot = new Employee();
		Employee driver = new Employee();
		Employee highness = getData();
		/*********************************************************
		 * Employee: data type and also the class name
		 * pilot/driver: objects
		 * new: is allocating an unused portion of computer memory || Calls the constuctor
		 * Employee(): constructor >> a method that establishes an object.
		 */
		//**********************************************************
		
		System.out.println("Cual es tu nombre piloto? ");//Ask
		name = input.nextLine();					     //Get name
		pilot.setName(name);							 //Save name in object
		//***********************
		//First the name of the object
		//Then the method to use
		//***********************
		//Variables should only be modified by methods and not directly.

		System.out.println("Y cual es el tuyo conductor? ");		//Ask
		name = input.nextLine();					     			//Get name
		driver.setName(name);										//Save name in object
		
		System.out.println("El piloto se llama " +pilot.getName()+ "\nY el conductor se llama " +driver.getName() );
		
	}
	
	public static class Employee //Normally classes are in their own files and the main method is on its own. In this 
	//case to be able to make objects from a class in the same class as main, this has to be static. Static is not used
	//for anything else in classes, at least is not recommended.
	{
		//Data field
		private String firstName;
		private String lastName;
		
		public void setName(String name) //Stores name in object
		{
			firstName = name;
		}
		public String getName()//Retrieves the name of an abject
		{
			return firstName;
		}
		
		
	}	
}
//-------------------------------------------------------------------------------------------
//This is how the data is stored, each object has his own copy of the method and variables they are using, 
//threfore, the values are being stored in the objects.

//pilot:
//firstName: "John"
//lastName: null

//driver:
//firstName: "Jane"
//lastName: null
