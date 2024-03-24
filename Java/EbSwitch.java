//The switch statement is useful when you need to test a single variable against a series of exact integer (including int, byte, and short types), 
//character, or string values.

//switch(Statament)
//case int,chat,etc:
//break; (exists the switch)
//defautl; IF nothing is true it executes this statement


	public static void main(String[] args)
	{
			String day = "";
			
			switch (day) //<<<<< Here put the variable (or a getObject) to compare it to a series of values that can be str,int,char, etc.
			{
			case "1":
				System.out.println("NOSSSIR");
				break;
				
			case "Monday":
			case "Tuesday":
			case "Wednesday":
				System.out.println("YESSSIR");  //<<<<<<< You can stack them if there are several cases in wich you want a certain outcome.
			
			default:        //<<<< IF nothing is true it executes this statement
				break;
            }
	}

//--------------------------------Stacking cases--------------------------------------


			case 1,2,3:     
                                            //These two ways of doing this are equivalent.
			case 1:
			case 2:
			case 3:
