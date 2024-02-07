import javax.swing.JOptionPane;

public class CbMethods {
	public static void main(String []jaja) {	
		
		String x,t;
		int yaya,times;
		
		x = JOptionPane.showInputDialog(null,"Insert number", "First number", JOptionPane.QUESTION_MESSAGE);
		t = JOptionPane.showInputDialog(null,"Insert number", "How many times", JOptionPane.QUESTION_MESSAGE);
		yaya = Integer.parseInt(x);
		times = Integer.parseInt(t);
		
		
		operation(yaya,times);//Here I send the arguments
	}

	
	public static void operation(int yaya,int times){//Here it receives it (Must specify data type for each)
		
		yaya = yaya * times;
		JOptionPane.showMessageDialog(null,yaya);
	}
	}