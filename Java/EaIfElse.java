	public static void main(String[]whatever) {
		int value1 = 4;
		int value2 = 5;
		
		if(value1 == value2) {
			System.out.println("");
		}
//---You can also:
		boolean x = (value2 > value1);
		
		if(x) {
			System.out.println("Smth");
		}
//---With objects you cannot compare them entirely, but you can compare individual values:
		
		if(person.getAge() == person1.getAge()) {
			System.out.println("They have the same age");
		}
		
	}
}
