pubic class MilesConversion{
public static void main(String[] whatever) {
		
		final int YARDS_IN_MILE = 1760;
		final int FEET_IN_MILE 	= 5280;
		final int INCHES_IN_MILE = 63360;
		float miles,yards, feet, inches;;
		
	
		
		
		String information ="""
				The value introduced in miles will be converted into yards, feet and inches	
				""", x;
		
		
		JOptionPane.showMessageDialog(null, information);
		x = JOptionPane.showInputDialog(null, "Inset the miles that'll be converted ", "Miles", JOptionPane.QUESTION_MESSAGE);
		miles = Float.parseFloat(x);
		
		yards = miles * YARDS_IN_MILE;
		feet = miles * FEET_IN_MILE;
		inches = miles * INCHES_IN_MILE;
		
		JOptionPane.showMessageDialog(null, miles + " are equivalent to: \n" + yards + " yards\n" + feet + "feet\n" + inches, "Information display", JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}