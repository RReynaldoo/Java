//Super and this cannot be used together
//You can use super regardless that you have overriden or not
//You can execute a method within a method

//With constructors it is used to call the super class' contructor and initialize the subclass' shared variables, instead of doing it all manually.
//Its should also be the first statement in the constructor, before any other declarations, because remember that the cosntructor of the superclass executes first

//<<<<<<<<<<<<<<<<WITH THE CONSTRUCTOR>>>>>>>>>>>>>>>>>>>>>>>

public class Animal {
  protected String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Dog extends Animal {
  private String breed;

  public Dog(String name, int age, String breed) {
    super(name, age); // Calling the constructor of the superclass
    this.breed = breed;
  }
}

//-----------------------------------------------------------------------------------

//<<<<<<<<<<<<<<<<WITHOUT THE CONSTRUCTOR>>>>>>>>>>>>>>>>>>>>>>>

public class Animal {
  protected String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class Dog extends Animal {
  private String breed;

  public Dog(String name, int age, String breed) {
    this.name = name;
    this.age = age;
    this.breed = breed;
  }

  // ...
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

//With methods it is used to access a superclass method
//This super calls can be placed in any order, contrary to how it works with constructors

public class Customer{
//...

public void display()
{
    System.out.println("One thing")
}
}
//---


public class VIP extends Customer{
    //...
    @override
    public void display()
    {
        super.display();    //This statement calls the superclass' method "display()"
        System.out.prinln("Another thing");
    }
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

//Also, here there are two images that show the difference between this and super
https://drive.google.com/file/d/1WZ8Xykl7ethcXEoScIaphjnDVp-hKqUV/view?usp=sharing