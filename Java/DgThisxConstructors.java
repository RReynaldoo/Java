	public static class Order{
		private int integer;
		private double doble;
		
		public Order(int integer, double doble) {	//<<<<<<<<<<<<<<< RECEIVES FROM this();
			this.integer = integer;
			this.doble = doble;
		}
		
		Order(double doble, int integer){
			this(integer,doble); // This sends this values to the "principal constructor". This is used to reorder the values to later save them in order in case they were
								//  inputed in other order.
			
		}

		
	}