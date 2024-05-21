public class Prove {
	public static void main(String[]a)
	{
		//*************************************CONCEPTS********************************************//
		//The scope of a variable is until the end of the block containing it {}
		
		//boolean		true or false															boolean c = true; or boolean c = (x>b);
		//byte			1 byte																	byte x;
		//short			2 bytes																	short x;
		//int			4 bytes																	int x;
		//long			8 bytes							use L at the end of the number			long x = 19L;
		
		//float			4 bytes with decimals			use F at the end of the number			float x = 19f;
		//double		8 bytes with decimals													double x =19;
				
		//char			single characters														char x = 'h';
		//String		sequence of characters													String x = "Hello";
		//******************************************************************************************//
		
		int y, h, b = 20;	//Declare once			*y and h cannot be used until a value is assigned
		y = 20;				//Then don't mention the datatype again
		
		final int internet;	//Final makes a variable a unchangeable constant;
		
		int number = 1_200;	//Underscores can be used for clarity
	}
}
