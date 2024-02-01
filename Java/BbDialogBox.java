import javax.swing.JOptionPane;

public class BbDialogBox {
	public static void main(String[] whatever) {
		String name;
		
		name = JOptionPane.showInputDialog(null, "What name was given to you"); 
																				/* To show an input 
																				 *dialog box for strings
																				 */
		JOptionPane.showMessageDialog(null, "So " +name+ " huh?");
		
//---------------------------------------------------------------------------------------------
//		Specific aspects (also applies to showMessageDialog and showConfirmDialog)
		
		String y;
		
		/*
		
		y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.ERROR_MESSAGE);
		y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.WARNING_MESSAGE);
		
		y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.INFORMATION_MESSAGE);
		y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.PLAIN_MESSAGE);
		y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.QUESTION_MESSAGE);
		
		*/
		
		/*
		 * null: Position
		 * first: Text inside the dialog box
		 * second: Text outside the dialog box
		 * JOptionPane.STH.MESSAGE: Changes the icon and buttons displayed:
		 * 
		 * buttons: first ones only ok, the rest its ok or cancel
		 * 
		 * Additionally: by default input is shown as question and output as information
		 */
//----------------------------------------------------------------------------------------------
// Converting from strings to int and double (can also be done with float and long)
		String integer,doubler;
		int newInt;
		double newDoub;
		
		integer = JOptionPane.showInputDialog(null, "Next number will be multiplied by two >> ", "Placeholder");//If not specified the type of dialog, then the second string will be placeholder
		newInt  = Integer.parseInt(integer) * 2;
		/*
		 * Once saved the value of integer we proceed to the next step
		 * 
		 *	We assign the value of integer to newInt and then (Optional) multiply it inmediatly by 2
		 */
		doubler = JOptionPane.showInputDialog(null, "Next number will be divided by three >> ", "Nomas aviso", JOptionPane.INFORMATION_MESSAGE);//If specified then it'll be header
		newDoub = Double.parseDouble(doubler) / 3;
		/*
		 * Once saved the value of doubler we proceed to the next step
		 * 
		 *	We assign the value of doubler to newdoub and then (Optional) divide it inmediatly by 3
		 */
		JOptionPane.showMessageDialog(null, integer + " multiplied by two is: " +newInt+ "\n" +doubler+ " Divided by three is: " + newDoub);
		
//--------------------------------------------------------------------------------------------------
		//Confinm dialog box has options and according with them we can manage what to do next with int and bool variables
		
		int store;
		boolean selection;
		
		store = JOptionPane.showConfirmDialog(null, "Te gusta el anime?");		//The value of the selection is stored
		selection = (store == JOptionPane.OK_OPTION);							//The selection and a option is compared
		
		JOptionPane.showMessageDialog(null, "So in the end your answer is "+ selection);	//We can see here if its true or false
		
		
		
		
		
	}
}