package jaja;
import javax.swing.JOptionPane;

public class haha {
	public static void main(String[] whatever) {

	//Ascention
		int i = 100;
 
        // Automatic type conversion
        // Integer to long type
        long l = i;
 
        // Automatic type conversion
        // long to float type
        float f = l;

		
//TypeConversion
		
		int integer= 50;
		float floatable= 12.22f;		
		
		float new = integer + floatable;	/*When adding two variables of different type your gotta assign the 
									  new value to a variable of the highest range type*/
		
									/*Also, when adding bytes, chars and shorts, the result has 
									 * to be an int if adding with a different datatype
									 */
									
		
		JOptionPane.showMessageDialog(null, integer);
		JOptionPane.showMessageDialog(null,integer + floatable);	//Performing operations in dialog boxes is possibles btw
		
//---------------------------------------------------------------------------------------------------
		//Type casting

		double value;
		float x = 12.2f,z;
		int j = 10,k;
		short h;
		byte value0;
		
		//This is how a variable is changed froma datatype to another
		k = (int)x;
		z = (float)j;
		h = (short)x;
		value = (double)x;
		value0 = (byte)j;
		
		JOptionPane.showMessageDialog(null, k + " " + z);
//-------------------------------------------------------------------------------------------------------------------
//Primitive to Strings
		String str;
		double d;
		int l;
		float f;
 		String str = Double.toString(d); // Convert double to String
		String str = Long.toString(l);  //Convert long to String
	 	String str = Float.toString(f); //Convert float to String
//Or just concatenate.
		str = d + "";

//To string
	d = Double.parseDouble(str);
	}

}
