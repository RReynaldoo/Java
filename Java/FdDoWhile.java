//******************Used to execute a loop at least once before proving the condition***************************** */
        
        int x = 0;
		
		do
		{
			System.out.println("");
			
		}
		while(x > 12);	//<<< This has to be true in order to keep the loop

		//Can be nested as well as for loops

		//***********************************************Optimizations**************************************** */

		//Instead of using expresions in the veification of a loop, use variables, this way the arithmatic or operation is not done every single time the loop executes again

		if (x > a + b)			//DONT
		if (x > sum)			//YES

		if (getValue()> 0)		//DONT

		value = getValue()		//YES
		if (value > 0)