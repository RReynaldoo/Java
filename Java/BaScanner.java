import java.util.Scanner;	//Before using scanner, importing its class its required
public class BaScanner {
	public static void main(String[]whatever) {
		
		Scanner NameOFThisObject = new Scanner(System.in);
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
		
		String day;
		int month;
		
		System.out.println("Day :");
		day = NameOFThisObject.nextLine();	//Retrieves the next whole line as a sting
		System.out.println("Month: ");
		month = NameOFThisObject.nextInt();	//Retrieves the next whole line as intgers
		System.out.println("\n Day is " + day + " Month is " + month);
		
		/*List of commands for next()
		 * 
		 */
		
	}

}
