//When using constructors with SuperClasses and SubClasses, both will execute.
//Although you cannot override variables, you can modify the value of a variable by changing its value in the subClass
//If you want a variable of the superClass to be unmutable, then make it FINAL

	public static void main(String[]a)
	{
		SubClass object = new SubClass();
		System.out.println(object.getId());
	}
	
	public static class SuperClass
	{
		private int id;
		
		SuperClass()                        //All this executes first
		{                                   //
			System.out.println("HI");       //
			int id = 12;                    //
		}                                   //
	}
	public static class SubClass extends SuperClass
	{		
		private int id;
		
		SubClass()                          //All this
		{                                   //executes second
			System.out.println("HELLOW");   //
			id = 20;  //<<< therefore this variable changes its value for this kind of objects (But this can be done more effitiently with "super")
		}                                   //
		public int getId()
		{
			return id;
		}
	}



    //Conditions for whether a subclass requires a constructor or not
    
//  1\If neither the superclass nor the subclass has a constructor explicitly defined by the programmer, then both classes will have a default constructor (a constructor with no parameters) provided by the compiler.
//  2\If the superclass has a default constructor explicitly defined by the programmer, then the subclass does not require a constructor.
//  3\If the superclass only has nondefault constructors (constructors with parameters), then the subclass must contain a constructor that calls the superclass constructor.