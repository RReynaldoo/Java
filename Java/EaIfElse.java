//
public class IFelse {
	public static void main(String[]whatever) {
		int value1 = 4;
		int value2 = 5;
		
		if(value1 == value2) {
			System.out.println("");
		}
		else {
			System.out.println("");
		}
//---You can also:
		boolean x = (value2 > value1);
		
		if(x) {
			System.out.println("Smth");
		}
//---With objects you cannot compare them entirely, but you can compare individual values:
		
		if(person.getAge() == person1.getAge()) {
			System.out.println("They have the same age");
		}
		
/*
 * Most often you use a comparison that includes one of six relational operators 
 * (==, <, >, <=, >=, or !=). However, you can use any expression that evaluates as 
 * true or false, such as a simple boolean variable or a call to a method that returns a 
 * boolean value.
 */
		
//Always use the {} to surround the statements in if and else. Is common and avoids errors.

//---------------------
	if (!(a > b))		//<<<<<<< "!"" is to negate the result, if it were to give "true", "!" changes it for "false"
//---------------------

//----------------------------------------THEY CAN BE NESTED--------------------------------------------------------

		if(value1 == value2) {
			if(value2 > 1)
				System.out.println();
			else
				System.out.println();
		}
		else
			System.out.println();
	}
//--------------------------------------------AND OR ------------------------------------------------------------------

			if (x > 10 && y > 10)		//&& for AND
										// || for or


			if ((x > 10) && (y > 10))	// Another format

			if ((x > 10 && y > 10) || (x < 10 && y < 10))	//You can have as many as you want.
			if ((x > 10 && y > 10) || x > 9)	//<<<<<<<<<<<<< When stacking remember to use the () priority to assure some values before others.
//----------------------------------------------------------------------------------------------------------------
/*
Never use "if" statements one after another without "else" statement. Always make sure to add an alternative to an "if", if not, then the next "if" is gonna execute 
regardless of the result of the last one.
*/