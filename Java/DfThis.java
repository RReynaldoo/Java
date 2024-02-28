	public static void main(String[]Whatever) {
		
		Student Wilmer = new Student(0671225,3.2);
		Wilmer.showInformation();
		
		
	}
	//**********************************IMPORTANT SECTION************************************ */
	public static class Student{
		private int id;
		private double gpa;
		
		public Student(int id, double gpa){
			this.id = id;         //this. is used to refer to the object's variable, the other id is the one send and initiated in the parameter
			this.gpa = gpa;       //This is done automatically, but when using the same name for the parameter and the object's variable, is very useful
		}
//***************************************IMPORTANT SECTION*********************************** */
		public void showInformation() {
			System.out.println("ID is " +id);
			System.out.println("GPA is " +gpa);
		}
		
		
	}

}
