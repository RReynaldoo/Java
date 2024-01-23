///222

public class assignmentoperators {
    public static void main (String [] args) {

        int a = 5;
        int b = 9;

        int result = a + b;           //add
        //int result = a - b;           substract
        //int result = a * b;           multiply
        //int result = a / b;           divide and get quotient
        //int result = a % b;           divide and get reminder
        
        System.out.println(result);

        int num = 10;
        //num = num - 1;
//--------------------------   +1
        //num++;            //post increment
        //++num;            //pre increment
//--------------------------   -1
        //num--;
        //--num;
//--------------------------   *# | /# | %#
        //num *= 2;             
        //num /= 2;
        //num %= 2;
//-------------------------- 

        //int resultado = num++;        //fetch value and then add
        int resultado = ++num;        //add and then feth the value

        System.out.println(resultado);


    }
    
}
