//You can use a superclass as a parameter for a method. 
//This method will possess the ability to execute methods of all subclasses of the superclass in the parameter. Very useful

public static void main(String[]a)
{
    Student Patrick = new Student();    //Instantiate a Student object
    presentation(Patrick)   //Sent the object to the method
}

public static void (Human name)     //The paremeter contains the name of the superclass Human that is a parent class of student (Also, methods can be like this, but they are better in classes)
{
    System.out.println("The student's name is "+ Patrick.getName());    //The method displays the student's name
}