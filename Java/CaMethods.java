package soething;
import javax.swing.JOptionPane;

public class CaMethods {
	public static void main(String []jaja) {	
		
		showMessage();//normal name used within the same class
		CaMethods.showMessage();//whole name, usually used when calling from another class	
	}
	
//-----------------------------------------------------This method is called
	
	public static void showMessage() {
//public means that this method is accessible for other classes| There are also private and protected
//static that doesn't require an object
/*void means that the method doesn't return any value to the method that called it. As shown below, this
		just executes code, but do not send anything back*/
//Parameter: data item received by a method
		
		String something =
				"""
				I call a method to execute this line of code.
				This way is easier to organize code.
				""";
		
		JOptionPane.showMessageDialog(null, something);
}}