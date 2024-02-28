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
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Example of instance methods using static variables in a useful way. You can also use static CONSTANTS for similar porpuses
    public class BaseballPlayer {
    private static int countOfPlayers = 0;
    private int number;
    private double battingAverage;

    public BaseballPlayer(int id, double avg) {
        number = id;
        battingAverage = avg;
        countOfPlayers = countOfPlayers + 1;
    }

    public void showPlayer() {
        System.out.println("Player #" + number +
                " batting average is " + battingAverage +
                " There are " + countOfPlayers + " players");
    }
}