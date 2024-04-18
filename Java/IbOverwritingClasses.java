//When you override a subclass you are creating/initiating a variable/method with the same name and parameters of the superclass.
//This way the subclass will use this new version of the method/variable in case that the original one from the superClass does not fit the subClass purpose

//*If you keep the same name but change the parameters then it will not override but overload, so it will only affect the calls that use that specific parameters*/

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
		@Override
		public void salutation() {                  //This method has been overrided, therefore when I call this method from a PRofessor object, this will
			System.out.println("Afternoon");        //, this will execute and not the one in Employee's version
		}
		
		
	}