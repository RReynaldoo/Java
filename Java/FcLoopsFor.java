		//----------------------------------------------------------------------------------	
            int x = 0;
			
		for(x = 0; x == 100; ++x )      // First initialize the variable; the condition for the loop to run(IT MUST BE TRUE); modify the value of the variable.
		{
			System.out.println(x);
		}

        // If the condition is false, such as x == 0, it will stop executing or wont do it at all.

        //----------------------Variations in "for loops"------------------------------------

		for(x = 0, y = 0; x <= 100; ++x )       //Initialization of more than one variable in the first section
        for(int x = 0, y = 0; x <= 100; ++x )   //Declaration of a variable within a for statement
        for(int x = 0; (x <= 100 || x > 10); ++x )  //Check for more than one parameter
        for(int x = 0; x <= 100; ++x, --y )     //ALter more than one variable
        for(x = ticket(), y = 0; x <= 100; addInterest(x) ) //You can replace the variables for methods (I think maybe "getValue" ones)
        for(; x <= 100; ++x )   //The first section can be omited
        for(;;) //This makes the loop infinite