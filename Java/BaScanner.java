import java.util.Scanner;	//Before using scanner, importing its class its required
import javax.swing.JOptionPane;
public class BaScanner {
public static void main(String[]whatever) {
		
		Scanner NameOFThisObject = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		/*
		 * Scanner: its datatype
		 * 
		 * NameOfThisObjct: self explanatory
		 * 
		 * new: used wheneveran object created is more complex than 
		 * a  primitive data type
		 * 
		 * Scanner(System.in): 'Scanner' is used to improve 'System.in'
		 * 
		 * Features: scanner retrieves input as tokens, wich are a set
		 * of characters divided by whitespaces.
		 */
		
		/*
		
		String day;
		int month;
		
		System.out.println("Day :");
		day = NameOFThisObject.nextLine();	//Retrieves the next whole line as a string
		System.out.println("Month: ");
		month = NameOFThisObject.nextInt();	//Retrieves the next whole line as integers
		System.out.println("\n Day is " + day + " Month is " + month);
		
		*/
		
		//There is a list of commands for "next()"
//-------------------------------------------------------------------------------------------
		// When using nextLine after any other next() method use this peace of code to avoid skipping it
		//Any next() will keep Enter in storage and the next nextLine() will be skipped, thats why this solution.
		
		/*
		int x;
		String y;
		System.out.println("Put a number>>");
		x = input.nextInt();
		input.nextLine();					//<<<<<<<<<<<<<<<<<<
		System.out.println("Now a letter>>");
		y = input.nextLine();
		System.out.println(x + " " + y);
		*/
//---------------------------------------------------------------------------------------------
		
		
		
	}
}

