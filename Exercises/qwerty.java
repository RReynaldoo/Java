package qwerty;
import java.util.Scanner;
public class Main2 {
	
	public static void main(String[]a) {
		
		Scanner input = new Scanner(System.in);
		int[] values = new int[999];
		int repetitions;
		int x = 0;
		int temporal;
		int braker = 0;

		System.out.println("Enter even values only, when an odd value is entered the program will end \n"
				+ "and display how many times each values is repeated.\n");
		do {
			System.out.println("Enter the value number " +(x+1)+ " >>>");
			
			temporal = input.nextInt();
			input.nextInt();
			if (temporal % 2 == 0) {
				
				values[x] = temporal;
				x++;
			}
			else {
				braker = 1;
			}
	
	
		}
		while(braker != 1);
		
		for(int y: values) {
			{
			System.out.println(values[y]);
			}
		}
		
		
		
		
		
		
}
}