	public static void main(String[]whatever)
	{
		Scanner input = new Scanner(System.in);
		String name;
		
		Employee pilot = new Employee();
		Employee driver = new Employee();
		/*********************************************************
		 * Employee: data type and also the class name
		 * pilot/driver: objects
		 * new: is allocating a new, unused portion of computer memory
		 * Employee(): constructor >> a method that establishes an object.
		 */
		//**********************************************************
		
		System.out.println("Cual es tu nombre piloto? ");
		name = input.nextLine();
		pilot.setName(name);
		System.out.println("Y cual es el tuyo conductor? ");
		name = input.nextLine();
		driver.setName(name);
		
		System.out.println("El piloto se llama " +pilot.getName()+ "\nY el conductor se llama " +driver.getName() );
		
		
	}
	
	public static class Employee //Normally classes are in their own files and the main method is on its own. In this 
	//case to be able to make objects from a class in the same class as main, this has to be static. Static is not used
	//for anything else in classes, at least is not recommended.
	{
		//Data field
		private String firstName;
		private String lastName;
		
		public void setName(String name) 
		{
			firstName = name;
		}
		public String getName()
		{
			return firstName;
		}
		
		
	}	
}
//-------------------------------------------------------------------------------------------
//This is how the data is stored, each object has his own copy of the method and variables they are using, 
//threfore, the values, in a way of speaking, are being stored in the objects.

//pilot:
//firstName: "John"
//lastName: null

//driver:
//firstName: "Jane"
//lastName: null
