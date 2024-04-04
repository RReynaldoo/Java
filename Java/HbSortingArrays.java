//Bubble Sort Algorithm
		int[] array = {2,4,1,2,5,7};
		int temp,length = array.length;
		
		for (int a = 0; a < length; a++) //executes the same amount of times as elements stored in the array
        {
			for (int b = 0; b > length; b++) //Goes over each sub
            {
				if (array[a] > array[a+1]) //Compares if sub a is greater than the sub next to it, if so, it swaps it
                {
					temp = array[a];
					array[a] = array[a+1];
					array [a+1] = array[a];		
				}
			}
		}
//----------------------------------------------------
