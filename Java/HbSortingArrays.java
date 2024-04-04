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
//----------------------------------ONE CAN ALSO USE THEM AS A METHOD AND SEND AND SORT OBJECT'S DATAFIELDS--------------------------------
public static void bubbleSort(Employee[] array) {
    int a, b;
    Employee temp;
    int highSubscript = array.length;

    for (a = 0; a < highSubscript; a++)
        for (b = 0; b < highSubscript - 1; b++)
            if (array[b].getSalary() > array[b + 1].getSalary()) {
                temp = array[b];
                array[b] = array[b + 1];
                array[b + 1] = temp;
            }
}
