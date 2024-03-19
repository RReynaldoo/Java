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
	}
