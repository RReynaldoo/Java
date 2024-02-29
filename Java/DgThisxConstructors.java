	public static class Order{
		private int integer;
		private double doble;
		
		public Order(int integer, double doble) {	//<<<<<<<<<<<<<<< RECEIVES FROM this();
			this.integer = integer;
			this.doble = doble;
		}
		
		Order(double doble, int integer){
			this(integer,doble); // This sends this values to the "principal constructor". This is used to reorder the values to later save them in order in case they were
								//  inputed different order.
			
		}

		
	}







    //---------------------------------------------------------EXTRAS-------------------------------------------------------------------------------------------------------------------
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
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Common methods in the Math class:

    //Math.pi
    abs(x)
    acos(x)
    asin(x)
    atan(x)
    atan2(x, y)
    ceil(x)
    cos(x)
    exp(x)
    floor(x)
    log(x)
    max(x, y)
    min(x, y)
    pow(x, y)
    random()
    rint(x)
    round(x)
    sin(x)
    sqrt(x)
    tan(x)
     //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     //To import all classes of a package you can use an astherisc after the package:
     import java.time *;
     java.time.LocalDate
     //java.time is the package | LocalDate is the class we are calling
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[]whatever) {
	//	Employee Jose = new Employee();			//Here this is initialized with a constructor
	
		LocalDate today = LocalDate.now();		//This is initialized with a static method = Class.method		||  	Assigns today's value
		LocalDate ptkCeremony = LocalDate.of(2024,5,11);	//Their constructors are private, thus, no accessible	||	Assigns the value we input
		
		//These return the values in integers
		today.getYear();
		today.getMonthValue();
		today.getDayOfMonth();
		
		//These return the String of day and month.
		today.getMonth();
		today.getDayOfWeek();
		
		/* Useful methods
		 *  plusDays(), plusWeeks(), plusMonths(), plusYears(), minusDays(), minusWeeks(), minusMonths(), and minusYears()
		 */
	}