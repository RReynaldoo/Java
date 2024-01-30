import javax.swing.JOptionPane;
public class BUsingData {
	public static void main(String [] whathever) {
		//Variable's scope is from it is declared till the end of the block {}
		
		
		int age = 12; //Declare once
		age = 23; // Then don't mention the type again
		
		int hour; //Uninitialized value. Cannot be displayed
		hour = 12;
		
		int height = 11, length = 22; //You can declare several with the same data type on the same line
		
		final float TAX_PAY = 0.12f; /* Constant uses "final" at the beginning
										It is usually written 'upper case' and 
										separated by underscore*/
//		System.out.println(hour);
//------------------------------------------------------------------------------
		/*
		int bill = 5;
		System.out.print("Send the day: ");		//Line 1
		System.out.print(bill);					//Line 1
		System.out.println(" of next month");	//Line 1
		
		System.out.println("For sure " + bill);	//Line 2 | Concatenation
		System.out.println(bill + height);		// 		   Addition (polymorphism with the + sign)
	
		System.out.println();
		System.out.println("A" + 2 + 3);		//Concatenation
		System.out.println("A" + (2 + 3));		//Adds and then concatenates
		*/
//------------------------------------------------------------------------------
		/*When concatenating you transform the whole display into a string, that is, 
		no math operation will be done*/
		
		int days = 10;
		JOptionPane.showMessageDialog(null,"" + days); //You can have empty quotes 
		JOptionPane.showMessageDialog(null,"You will die in " + days + " days");
		
//-------------------------------------------------------------------------------
		
		int x = 1_000, y = 22_323, z;	//Underscore can be used to separate numbers
		z = x;
		x = y;			//This way you interchange the values of two variables
		y = z;
		
		long xy = 122112L; // Long variables carry a 'L' at the end,otherwise will be declared as an int
		float xz = 121223F;// Float variables have a 'f' at the end, otherwise will be declared as a doable
		
		char aChar = 'A', lol = '9'; /*char variables can store either numbers or letters, but
		numbers will not be operated if declared this way*/
		
		char newLine = '\n'; //New lines and other nonprinting characters can be stored as well
		/*Look for the list (Im not writing the whole thing) */
		
		String myName = "Whole sentences can be stored in strings";
		String block =
				"""
				Blocks like this, also used with commands,
				can be used with strings.
				
				Which its cool
				""";
		JOptionPane.showMessageDialog(null, block);
		/* All commands from Char and String can be use in GUI panel*/

//--------------------------------------------------------------------------------
		int income = 12;
		int bills = 13;
		
		boolean sth = true;						//boolean vaules can be assigned directly
		boolean amIBroke = (income < bills);	//or by a comparison between parenthesis
		System.out.println(amIBroke);
//--------------------------------------------------------------------------------
		
		
	}
}
