import java.util.Scanner;

public class qwerty {
	public static void main(String[]whatever) {
		String day = qwerty.firstQuestion();
		int number = qwerty.secondQuestion();
		
		System.out.println("Today is " + day + " and the number is " + number);
		
	}
//-------------------------------------------------------------
	public static String firstQuestion() {
		String x;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide the name of the day");
		x = input.nextLine();
		
		return x;
	}
//-------------------------------------------------------------
	public static int secondQuestion() {
		int x;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide the number of the day");
		x = input.nextInt();
		
		return x;
	}
	
	//String, int, double etc at the top is the type of the return value, which is replacing void (Used when nothing is returned)
	//You gotta store the return value in a variable of the same kind.
	//Is not recommended to return multiple times, instead, just return in a array or similar.
	
	//You can return a value, variables, constants, another method and even operate the value returned at the moment:
	//return x * 5;
	
	//However, remmember that this is possible but not recommended.
}
