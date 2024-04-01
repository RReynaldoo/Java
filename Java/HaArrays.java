//An array is a named list of data items that all have the same data type. 
//Each data item is an element of the array

//Declaration:

		//You must always specify the size. In java.util there is an array list that lets you modify the size
		
		int[] nums;			//declare
		nums = new int[20];	//specify size
		
		double[] nams = new double[20];	//declare and specify at the same time
		nams[0] = 12;					//Assigns a value to index 0
		System.out.println(nams[0]);	//Prints the value in index 0

		[0,0,0,0,0]				//default for int
		[false,false,false]		//for bool
		[ , , , , ]				//for char

			//When populating an array you either set all the values or go one by one
		int[] array = {1,2,3,4,5,6};	//When initializig and declaring the size its the number of values inserted
		array[0] = 12;