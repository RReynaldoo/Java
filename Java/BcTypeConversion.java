package jaja;
import javax.swing.JOptionPane;

public class haha {
	public static void main(String[] whatever) {
		
//TypeConversion
		
		int sasa= 50;
		float jaja= 12.22f;		
		
		float gaga = jaja + sasa;	/*When adding two variables of different type your gotta assign the 
									  new value to a variable of the highest range type*/
		
									/*Also, when adding bytes, chars and shorts, the result has 
									 * to be an int if adding with a different datatype
									 */
		
		JOptionPane.showMessageDialog(null, gaga);
		JOptionPane.showMessageDialog(null,sasa+jaja);	//Performing operations in dialog boxes is possibles btw
		
//---------------------------------------------------------------------------------------------------
		//Type casting
		
		int j = 10,k;
		float x = 12.2f,z;
		short h;
		
		//This is how a variable is changed froma datatype to another
		k = (int)x;
		z = (float)j;
		
		h = (short)x;
		
		JOptionPane.showMessageDialog(null, k + " " + z);
		
	}

}
