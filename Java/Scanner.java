import java.util.Scanner;	//Used to import Scanner

public class Prove {
public static void main(String[]whatever) {
		
		//************************************DETAILS***********************************//
		//Scanner is the name of its class
		//input is name of the object
		//new is used to call the constructor
		//Scanner(System.in) is to improve System.in is the Scanner functionalities
		//************************************DETAILS***********************************//
		
		Scanner input = new Scanner(System.in);	//Declaration of scanner object
		String storage;		
		int storage1;
		double storage2;
		
		storage = input.nextLine();		//Receives the next line as input 
		storage = input.next();			//Receives the input until a whitespace
		storage1 = input.nextInt(); 	//Receives the next integer
		input.nextLine();				//<<<<<<<<<<<<<<<<<<				Fix used after using nextInt or similar because of how they work.
		storage2 = input.nextDouble();	//Receives the next double
	}
}