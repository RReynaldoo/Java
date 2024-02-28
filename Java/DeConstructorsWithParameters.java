public class Main{
	
	/*Custom constructors are useful for initializing objects with specific values or default values 
	  when they are created.*/
	
	public static void main(String[]whatever) {
		Employee chauffeur = new Employee();		//Uses the constructor without parameters
		Employee cook = new Employee("Pedro");		//Uses the constructor with String parameter to assign a value
		
		System.out.println("The chauffers name is not assigned: " +chauffeur.getValue()+ "\n While the Cook's is: " +cook.getValue());
	}
	
	public static class Employee{
		private String str;
		private int x;
		
		Employee(){			//All no-parameter objects will have no special assignmets here. This can be also be left empty
			str = "";
		}
		Employee(String name){// All constructures with this parameter will save the value they intend to send.
			str = name;
		}
		public String getValue() {
			return str;
		}
//---------------------------------------------------------------------------------------------------------------------------------
		//Constructors are usually public:
		public Employee(){
		}
		//However, they can be also private, protected, etc. If not specified then it will be package-private, which means that the constructor is accessible only within the 
		//same package.
		Employee(){
		}



	}
	
	
}