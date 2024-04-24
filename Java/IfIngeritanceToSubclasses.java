//Athough a subclass can inherit it's parent non static methods, they cannot inherit their static methods, nor override them. 

/*However when you intend to override a static method with another nonstatic method you can hid it and access it by using the name of the subclass and the method you want to use,
, and when it comes to use the parent's version you just call it as how its done normally, no need to use super since its a static that can be used by "anything"*/

public class BaseballPlayer
{
    public static void showOrigins()
    {
        System.out.println();
    }
}

public class ProfessionalBaseballPlayer
{
    public static void showOrigins()        //<<<< You create another version of the superclass method( the terminology is you hide it), and this can be access as any other method
    {
        BaseballPlayer.showOrigins();       //<<<< You access the superclass method in a conventional way
        System.out.println();
    }
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//When you make a method "final" you make it so that no suclass method can even hide it and all the child classes can only use that version of the method.

public final void displayMessage()
{
    System.out.println();
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//When you declare a class to be final, all of its methods are final, and it cannot have subclasses.

public final class Home
{
    private int nothingness;
}