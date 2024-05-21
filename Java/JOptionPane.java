import javax.swing.JOptionPane;		//To import the functionality

	//**************************************************************************  ESSENTIAL  ****************************************************************************
	
	String name = JOptionPane.showInputDialog("Enter your name");				//To show an input message and store it on a String variable (It always stores it as a string)
	int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));	//Parse is used to transform the string input to a primitive datatype
	
	JOptionPane.showMessageDialog(null, "Hello "+name);							//To show a message 
	
	

	//**************************************************************************  OTHERS THAT ALSO EXIST  **************************************************************************
	 							showMessageDialog and showConfirmDialog AND showInputDialog 
	 												versions exist
	
	String y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.ERROR_MESSAGE);
	String y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.WARNING_MESSAGE);
	
	String y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.INFORMATION_MESSAGE);
	String y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.PLAIN_MESSAGE);
	String y = JOptionPane.showInputDialog(null,"First","Second",JOptionPane.QUESTION_MESSAGE);		


	 * null: Position
	 * First: Text inside the dialog box
	 * Second: Text outside the dialog box
	 * JOptionPane.STH.MESSAGE: Changes the icon and buttons displayed:
	 * 
	 * buttons: first ones only ok, the rest its ok or cancel
	 * 
	 * Additionally: by default input is shown as question and output as information
	 */
	
	
	
	
	
	
	
	//**************************************************************************  Confirm dialog boxes information  **************************************************************************
	
	int storage;
	boolean selection;
	
	storage = JOptionPane.showConfirmDialog(null, "Te gusta el anime?");		//The value of the selection is stored
	selection = (storage == JOptionPane.OK_OPTION);							//The selection and a option is compared
	
	JOptionPane.showMessageDialog(null, "So in the end your answer is "+ selection);	//We can see here if its true or false
