import javax.swing.JOptionPane;
public class BUsingData {
	public static void main(String [] whathever) {
		//Variable's scope is from it is declared till the end of the block {}
		
		
		int age = 12; //Declare once
		age = 23; // Then don't mention the type again
		
		int hour; //Uninitialized value. Cannot be displayed
		hour = 12;
		
		int height = 11, length = 22; //You can declare several with the same data type on the same line
		
		final float TAX_PAY = 0.12f; /* Constant uses final at the beginning
										It is usually written uppercase and 
										separated by underscore*/
//		System.out.println(hour);
//------------------------------------------------------------------------------
		int bill = 5;
		System.out.print("Send the day: ");		//Line 1
		System.out.print(bill);					//Line 1
		System.out.println(" of next month");	//Line 1
		
		System.out.println("For sure" + bill);	//Line 2 | Concatenation
		System.out.println(bill + height);		// 		   Addition (polymorphism with the + sign)
	
		System.out.println();
		System.out.println("A" + 2 + 3);		//Concatenation
		System.out.println("A" + (2 + 3));		//Adds and then concatenates
//------------------------------------------------------------------------------
		//When concatenating you transform the whole display into a string
		int days = 10;
		JOptionPane.showMessageDialog(null,"" + days); //You can have empty quotes 
		JOptionPane.showMessageDialog(null,"You will die in " + days + "days");
//-------------------------------------------------------------------------------
		
		int x = 1, y = 2, z;
		z = x;
		x = y;			//This way you interchange the values of two variables
		y = z;
//--------------------------------------------------------------------------------
		
		
	}
}
