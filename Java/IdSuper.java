//With constructors it is used to call the super class' contructor and initialize the subclass' shared variables, instead of doing it all manually.

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