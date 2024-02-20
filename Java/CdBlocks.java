public class yo {
	public static void main(String[]whatever) {
		//Blocks and scopes
		/*The same name of a variable can be used in different methods but is not recommended in the same
		method in different blocks.*/
		//The existence of a variable goes from the outer to the inner, the inner cannot exist in the outer
		int hola = 33;
		{
			int number = 12;
			System.out.println(number + " " + hola);
		}
		{
			int number = 12;
			System.out.println(number + " " + hola);
		} 
		
		//Hola exists in the inner blocks but number doesn't in the outer
		
		
	}

}