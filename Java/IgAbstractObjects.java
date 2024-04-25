//Types of classes when it comes to inheritance
//An abstract claas is one from which you instantiate objects
//An abstract class is one you use to extend to other classes. You cannot create an object from a class that is being extended.

//Methods in abstract classes
//Nonabstract methods: is given a body and is inherited by its children
//Abstract method: has no body(No curly braces or statements), and must be given a body in its child classes

//*************************************************************************************************************************************************************************************/

public static void main(String[]args)
	{
		Cat Yuno = new Cat();
		Yuno.speak();		//The object access the abstract, overridden method of the Cat class.
		Yuno.getName();		//The object can access non abstract methods of the parent
	}
	
	public static abstract class Animal	//The class is abstract, meaning no Animal classes can be created.
	{
		private String name;
		public abstract void speak();	//The method is abstract, meaning child classes must override and contain this method
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
	}
	
	public static class Cat extends Animal
	{
		@Override
		public void speak()		//The implementation of abstract methods in animal subclasses is a must, otherwise the program wont run
		{
			System.out.println("MEOW");
		}
	}


