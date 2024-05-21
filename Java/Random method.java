/************************************RANDOM VALUES**********************************************/
		Random random = new Random();			//To create a random object
		
		int x = random.nextInt(6)+1;			//To generate a random integer from 1 to 6 (Without the +1 it would be from 0 to 5)
		double y = random.nextDouble();			//Generate a random double
		boolean q = random.nextBoolean();		//Generate a random boolean