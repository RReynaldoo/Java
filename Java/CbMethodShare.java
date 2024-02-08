import javax.swing.JOptionPane;

public class CbMethodArgShare {
	public static void main(String []jaja) {	
		
		String x,t;
		int yaya,times;
		
		x = JOptionPane.showInputDialog(null,"Insert number", "First number", JOptionPane.QUESTION_MESSAGE);
		t = JOptionPane.showInputDialog(null,"Insert number", "How many times", JOptionPane.QUESTION_MESSAGE);
		yaya = Integer.parseInt(x);
		times = Integer.parseInt(t);
		
		
		operation(yaya,times);//Here I send the arguments
	}

	
	public static void operation(int yaya,int times){//Here it receives it (Must specify data type for each one)
													 /*If put with different name, then it will use position order.
													 if one is with same name and the other has a different one then he changes will take the value of the other
													 Just for clarity dont do it unless otherone say any different
													 */
		
		yaya = yaya * times;
		JOptionPane.showMessageDialog(null,yaya);
	}
	}