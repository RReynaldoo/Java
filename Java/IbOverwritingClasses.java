//When you override a subclass you are creating/initiating a method with the same name and parameters of the superclass.\
							//Variables cannot be overrided, any mention of that in this section is an error
//This way the subclass will use this new version of the method in case that the original one from the superClass does not fit the subClass purpose

//*If you keep the same name but change the parameters then it will not override but overload, so it will only affect the calls that use that specific parameters

//------------------------------------
		Employee()
		public void salutation()
		{
			System.out.println("morning");
		}
		
	}
//-------------------------------------
	public static class Professor extends Employee
	{
		@Override	//<<<Needed to override methods
		public void salutation() {                  //This method has been overrided, therefore when I call this method from a Professor object
			System.out.println("Afternoon");        //, it will execute and not the Employee's version
		}
		
		
	}

	