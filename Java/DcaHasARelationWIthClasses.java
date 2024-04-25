//Has relation is not more that when a class instantiates an object of another class
// and uses it.

class Engine        //This class is made for another class
{
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();  //Here the object is created to be use for this class (But I think you can instatiate it outside of a method as this is, gotta investigate)
    }

    public void drive() 
    {
        engine.start();     //It ends up being used here. Basically it is using the other class functionalities here, since it is part of the car. That the kind of relation they have
        System.out.println("Driving...");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}