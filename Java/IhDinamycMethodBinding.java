//Basically a reference variable that can reference any method of the child classes.
//Of you have an abstract animal superclass and some subclasses, athough you cannot creat animal objects, you can create an animal reference variable to refer to a subclass method of that superclass

public class Main{
    public static void main(String[])
    {
        Animal variableRef; //<<<Here you create the Animal abstract superclass reference variable

        variableRef = new Cow();    //You assing it to refer to the Cow class
        variableRed.speak();    //ANd not it can access cow methods
        animalRec = new Dog();      //And so with others
        variableREf.speak();
    }
}