public class qwertyy {
		public static void main(String[]whatever)
		{
			Employee pilot = new Employee();
			Employee driver = new Employee();
			/*********************************************************
			 * Employee: data type and also the class name
			 * empInfo: name of the object
			 * new: is allocating a new, unused portion of computer memory
			 * Employee(): constructor >> a method that establishes an object.
			 */
			//**********************************************************			
		}
		
		
		
		public static class Employee
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