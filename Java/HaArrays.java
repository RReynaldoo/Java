//An array is a named list of data items that all have the same data type. 
//Each data item is an element of the array
//	A LIST OF ARRAYS IS A GROUP OF VARIABLES OR OBJECTS TO BE SIMPLE.
//Declaration:

		//You must always specify the size. In java.util there is an array list that lets you modify the size
		//***************************************************************************************************************************************************************************** */
		//You can initialize an array of 12 size and just enter 5 values, the other ones will store a defautl value of 0 or " ". So in this cases if you want to use only the indexes with values
		//you will have to have a count varuable that will count how many times the loop of assigning values has been executed, sort them you are set.
		//If you wanna pass all the remaining values in the end set them all to 999 or above the values your are sorting.
		//***************************************************************************************************************************************************************************** */
		
		int[] nums;			//declare
		nums = new int[20];	//specify size
		
		double[] nams = new double[20];	//declare and specify at the same time
		nams[0] = 12;					//Assigns a value to index 0
		System.out.println(nams[0]);	//Prints the value in index 0

		[0,0,0,0,0]				//default for int
		[false,false,false]		//for bool
		[ , , , , ]				//for char

		//When populating an array you either set all the values at first or go one by one
		int[] array = {1,2,3,4,5,6};	//When initializig and declaring the size its the number of values inserted
		array[0] = 12;

		//Enhaced for loop, also called "for - each"
		for (int x : array) {	//This is to go one by one in the elements of the loop.
		System.out.println(x);
		}

//------------------------------------------CREATING OBJECTS------------------------------------

		Students[] psychology = new Students[12];	//This statement creates 12 objects
		
		for(int x = 0 ; x < psychology.length; x++) {				//Constructs the objects
			psychology[x] = new Students();
		}
		
		int x = psychology.length;//Used to retrive the number of objects in an array

//-----------------------------------------	USE ARRAYS TO EVALUATE A LIST OF DATA-------------------------------------------------------

 for(int[] x; algo){
	if(int[x] > MAX){
		a++;
	}
 }
 //-------------------------------------------USE VARIOUS ARRAY POSITIONS TO SOLVE PROBLEMS---------------------Array match------------------
 		final int MAX = 6;
		int[] validValues = {1,2,4,6,7,8};
		int[] prices = {122,332,444,6565,777,88};
		
		for( int x = 0; x > MAX; x++) {			//Goes over every values
			if (itemOrdered == validValues[x]) {	//CHecks if the value asked exists
				System.out.println(prices[x]);		//Pints the price in the same position as first one in other array.
			}
//-------------------------------------------ARRAY SUBS CAN BE SENT TO METHODS--------------------------------------------------------------
//The first one passes individual values and the array values remain the same when is used again
//IN the last one the whole array, its address, is passed to the method, therefore the whole array is modified permanently

		int[] array = {1,2,3,4,5};
		
		for (int y = 0; y<5 ; y++) {
			Class.display(array[y]);	//	Passes the data per value
		}

		//------
		Class.modify(array);	//When passing an array to a method no brackets are needed
		return array;			//same when returning, since you are returning an address (memory address)
		public static void Receiver(int[] array)	//The header should look like this
		
//--------------------------------------------