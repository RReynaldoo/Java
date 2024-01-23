//444
public class logicaloperators {
    public static void main (String [] args) {

        int a = 2;
        int b = 3;

        int x = 8;
        int z = 9;

        //boolean result = a < b && x > z;                  //And operator
        boolean result = a < b || x > z;                    //Or operator

        //boolean sd = !result;                               //Not operator
        System.out.println(!result);                        //Not operator



    }
    
}
