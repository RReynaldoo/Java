//In Java, a reference is a variable that holds the memory address of an object, allowing us to access and manipulate the object's data and methods.
//A reference variable does not actually contain the object itself, but rather a memory address that points to the object's location in memory.

RefVar = new Human();       //Can assignt the object ot access its methods
String RefVar2 = Patric.getName(); //Can store a value of an object also

//Multiple reference variables can point to the same object, allowing us to access and manipulate the object's data and methods through different reference variables.

Human Patrick = new Human();
Human Louise = Patrick;         //This will reference the values in Patrick object, but will not store them
