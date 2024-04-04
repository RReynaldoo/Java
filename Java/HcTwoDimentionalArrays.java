//Basically arrays that constain arrays

		int[][] dorms = new int[2][5];              //They second one is listed in the first one
		int [][] docs = {{1,2,3,4,5},{6,7,8,9,0}};  //The first one would look like this like this

        //When you pass a two-dimensional array to a method, you pass the array name just as you do with a one-dimensional array.
        Add.showValues(dorms);
        //There are two lengths, column length and row length

		System.out.println(dorms.length);   //will evaluate the number of arrays in the array which is 2
		System.out.println(dorms[0].length);//Will evaluate the length of the array in position 0 which is 5

//------------------------------------------------THE LENGTH OF EACH SUBSEQUENT ARRAY CAN BE DECLARED INDENPENDENTLY--------------------------------------------------------------------------------------
        int[][] dorms = new int[1][];
		
		dorms[0] = new int[5];
		dorms[1] = new int[5];

//THIS CAN EXIST AS WELL
    int[][][] time;         //Which could be int[year][month][day]