//1111

//You cant assing a bigger format value like "int" in byte because "byte's" capacity is smaller.
//You cant either do it if the value would fit, like if "int" = 12 because of the firts rule,

//You can assign a "byte" value to a "int" and that is called conversion | to convert a lower capacity value to a bigger one you need to use "casting"
//In this conversions you can loose data, like if you convert a float to int you'll loose the decimals

public class typeconversion { 
    public static void main (String [] args) {

        byte b = 127;
        int i = b;                          //You can make conversions from small types to bigger types
        System.out.println(i);

        int a = 256;
        byte d = (byte)a;                   //You can save values with casting like this | Past the limit (-128-127) it'll will divide by its range, wich is 256
        System.out.println(d);

        float e = 12.2f;
        int q = (int)e;                     //This will work but the decimals will be lost
        System.out.println(q);

        //  TYPE PROMOTION
        
        byte k = 10;
        byte o = 30;
        int r = k * o;
        System.out.println(r);              //Since the result number is out of range it will be store as int, as it was indicated before

    }
}
