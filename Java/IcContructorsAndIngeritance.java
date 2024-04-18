//When using constructors with SuperClasses and SubClasses, both will execute.
//Although you cannot override variables, you can modify the value of a variable by changing its value in the subClass

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
			id = 20;  //<<< therefore this variable changes its value for this kind of objects
		}                                   //
		public int getId()
		{
			return id;
		}
	}