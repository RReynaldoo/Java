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
//-------------------------------------------------------------------------------------------------------------------------------------
//The insertion sort (I need an explanation, I dont get thos)
int[] someNums = {90, 85, 65, 95, 75};
int a, temp;
for (a = 1; a < someNums.length; a++) {
    temp = someNums[a];
    int b = a - 1;
    while (b >= 0 && someNums[b] > temp) {
        someNums[b + 1] = someNums[b];
        b--;
    }
    someNums[b + 1] = temp;
}

//******************************************************************************************************************************************/
//----------------------------------------  SORTING ALGORITHMS WITH Arrays METHODS-----------------------------------------------------------
int[] intArray = { 2, 4, 7, 10, 13 };
int key = 10;
int result = Arrays.binarySearch(intArray, key);     //Searchs the sub position in the array
System.out.println("Index of " + key + " in intArray: " + result);

Output:
Index of 10 in intArray: 3
//-----
int[] intArray1 = { 1, 2, 3 };
int[] intArray2 = { 1, 2, 3 };
boolean isEqual = Arrays.equals(intArray1, intArray2);  //Checks if two arrays are equal (Boolean methods)  //Returns -1 if it is not found
System.out.println("intArray1 and intArray2 are equal: " + isEqual);

Output:
intArray1 and intArray2 are equal: true
//-----
char[] charArray = new char[5];
Arrays.fill(charArray, 'x');        //  Fills the array with the value selected
System.out.println(Arrays.toString(charArray));

Output:
[x, x, x, x, x]
//------
long[] longArray = { 5, 3, 8, 1, 6 };
Arrays.parallelSort(longArray);     //Same as sort() but more efficient for thousands of values
System.out.println(Arrays.toString(longArray));

Output:
[1, 3, 5, 6, 8]
