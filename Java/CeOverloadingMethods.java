class HelloWorld {
    public static void main(String[] args) {
        //This is basically have several methods with the same name, but each of them will be called based on what is send to them.
        //Example with quantity
        int x = 12;
        int y = 23;
        double z = 12.2;
        
        displayNumber(x); //Executes the one with only one variable in its parameter
        displayNumber(x,y);//Executes the one with two variables in its parameter
        
        //Example with datatype
        getValue(x);//Executes the one with int parameter
        getValue(z);//Executes the one with double parameter
    }
//------------------------------------------------
    public static void displayNumber(int x){
        System.out.println(x);
    }
    public static void displayNumber(int x, int y){
        System.out.println(x+" "+y);
    }
//------------------------------------------------
    public static void getValue(int smth){
        smth = smth / 2;
        System.out.println(smth);
    }
    public static void getValue(double smth){
        smth = smth / 2;
        System.out.println(smth);
    }
}