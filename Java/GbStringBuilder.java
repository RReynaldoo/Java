//StringBuilder and StringBuffer do the same but:

//Builder is more efficient
//Buffer if thread safe

//-----------------------------------------------------------------------------------//
//Use Strings for values that won't change or be modified after creation. 
//Use StringBuilder for tasks that involve the manipulation of strings.
//-----------------------------------------------------------------------------------//

		Scanner input = new Scanner(System.in);
		String someString = "Nikki";
		
		//Almost all methods of str work with strBuilder.
		
		
		StringBuilder name, name2 = null;					//Initialize it as empty
		name = new StringBuilder(someString);		//Call constructor and insert a string
		name = new StringBuilder(input.nextLine());	//Call constructor and use input
		
		//Strings lenght is the same as the number of characters it holds
		//StrBuilders capacity have a buffer and increases its capacity automatically as the string
		//gets bigger. However, one can set its capacity and check it with the following methods.
		
		int bufferCapacity = name.capacity();	//Returns the capacity of the buffer
		name.setLength(33);						//sets its length (Helps save memory)
		
		//To compare two stringBuilders you first convert them to strings and then compare:
		//Use .toString to use the string methods
		
		name.toString().equals(name2.toString());	//Like this to make it quick
		
		//To append,insert,chartAt:
		
		name.append(name2);
		name.insert(2,"no");
		name.charAt(2);