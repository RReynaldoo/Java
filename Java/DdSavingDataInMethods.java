import java.util.Scanner;
public class Main {
	
	public static void main(String[]W) {
		Sillas right = new Sillas();
		Sillas wrong = new Sillas();
		
		Scanner input =  new Scanner(System.in);
		int pesos;
		
		System.out.println("Pesos >> ");
		pesos =  input.nextInt();
		input.nextLine();			//Fix
		
		right.setValue(pesos);		//Use method to save the value
		wrong.dollars2 = pesos;		//Direct save
		 //Its recomendable to save with methods and not directly since it allows us to process the data however we like, instead of a plain, direct save, which is not recomendable
		 
		
		System.out.println("If saved and retrieved with methods the result is " +right.getValue()+
							"\nIf saved directly without methods the result is " +wrong.dollars2);
		
	}
	
	public static class Sillas{
		private int dollars;
		public int dollars2;
//-------------------------------------------------
		public void setValue(int pesos) {
			dollars = pesos * 56;
		}
//-----------------------------------------	
		public String getValue() {
			String input;
		
			input = "$" + dollars;
			return input;
		}
	}

}