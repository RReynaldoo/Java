/*ACLARATIONS

    Methods are like variables but better. Variables can hold only one value of one type.

    On the other hand, objects can hold several of various types and we can manipulate them with different methods. Thats why we can
    initialize them as easily as writing their class and then a name. The class itself is like the object 0, and from it we can 

    NameOfTheClass NameOfObject.

    We are creating a object 1 from the blueprint that is the class. Is like, each time we create a class, we are creating a datatype, and each object we initiate from there
    will have access to his methods and variables.
 */

			//Composition is an object inside another. The principal has access to the values that reside in the second one. Allowing us to create more objects in less lines of code


//*****************UTILITY OF COMPOSITION*************** */
//Phone
//  Brand(String)
//  Status(Object) = String usage, boolean works

//Car
//  Brand
//  Status(Object) = String usage, boolean works
//***************************************************** */

//----------------------------------------------------------------------------------------------------------------------------------
public static class Status{
		private String usage;
		private boolean works;
		
		//Constructor
		public Status(String usage, boolean works){			//First object "Status"
			this.usage = usage;
			this.works = works;
		}
	}
	
	public static class Phone{
		private Status status;		//First Object is used as a variable for the values it stores inside.
		private String brand;
		
		public Phone(Status status, String brand) {	//We get our values and we store the data
			this.status = status;
			this.brand = brand;
		}		
	}

    public static void main(String[] args) {
    Status phoneStatus = new Status("personal", true);	//First we specify the  status
    Phone phone = new Phone(phoneStatus, "Samsung");	//Then we send the remaining data
}

//-------------------------------------------Second version----------------------------------------------------------------BOOK VERSION

	public static class Status{
		private String usage;
		private boolean works;
		
		public Status(String usage, boolean works){	//Status object is stated
			this.usage = usage;
			this.works = works;
		}	
	}

	public static class Phone{
		private Status status;	//We use it to store data in less code quatinty
		private String brand;
		
		public Phone(String usage, boolean works, String brand) {	//Receive the data
			status = new Status(usage,works);	//We call the constructor of the variable(Object), and store the data within it. In parentesis we specify which variables will be stored
			this.brand = brand;	
		}
    }

    public static void main(String[] args) {
    Phone phone = new Phone("New",true, "Samsung");	//We send all data

//-----------------------------NESTED CLASSES--------------------------------------------------------------------------------------------------

//They can be nested inside of the class that is using them to be easier to understand, but it will make it usable only for the class where it is nested
//So unless you plan to use it only for that class in particular, is better to leave it outside.


	public static class Phone{
		private Status status;	//We use it to store data in less code quatinty
		private String brand;
		
		public Phone(String usage, boolean works, String brand) {	//Receive the data
			status = new Status(usage,works);	//We call the constructor of the variable(Object), and store the data within it. In parentesis we specify which variables will be stored
			this.brand = brand;	
		}
		
	public static class Status{
		private String usage;
		private boolean works;
		
		public Status(String usage, boolean works){	//Status object is stated
			this.usage = usage;
			this.works = works;
		}	
	}
}

//STUDY HOW TO USE CLASSES AS DATAFIELDS FOR OTHER CLASSES, HOW TO ASSIGN AND RETRIEVE THEIR INFORMATION