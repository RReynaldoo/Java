import javax.swing.JOptionPane; //Packaged for GUI
//-----------------------------------------------------------------------------
public class Main
{
	public static void main(String[] whatever) {

			// When performing operations we use all + - * /(With int it will round back always and with float will give the extact number)
		 	// and % (To get the reminder)
		 
		/*
		 * Arithmetic operations are executed from left to right when they are from the same category (+ and -) and (/ * % )
		 * 
		 * To change the priority and set some values to operate first than others we use () and put values inside them. They will operate 
		 * before the others
		 * 
		 * You can also have (x + (y - 5)) and the inner parenthesis will have priority. Always look for a way to be efficient with this.
		 */
//--------------------------------------------------------------------------------------------------------
		//There is not a bluild in function for rounding floats so it has to be done manually as follows:
		
		int rounded;
		double number;
		String wawa;
		
		wawa = JOptionPane.showInputDialog(null, "Insert a number");
		number = Double.parseDouble(wawa);
		
		number = number * 100;	//This
		number = number + 0.5;	//This
		rounded = (int)number;
		rounded = rounded / 100;	//And this operation are the correspondent procedures to round a float value
		
		JOptionPane.showMessageDialog(null, rounded);
		
	
		
		
		
		
	}
}
