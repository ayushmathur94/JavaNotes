package superkeyword.superwithconstructors;

public class RunForSuperWithConstructor {

	public static void main(String[] args) {
		Student studentOne =  new Student();
		
		/* Output with above line
		 *   Person Created !! This is Person Class (Parent Class) non-arg Constructor.
         *   Student Created !! This is Student Class (Child Class) non-arg Constructor.
		 */
		
		Student studentTwo = new  Student(24, "Shreya");
		
		/* Output with above line
		 *  Person created with age =  24 and this is Person Class (Parent Class) Parameterized Constructor
         *  Student created with name = Shreya And this is Student Class (Child Class) Parameterized Constructor		
		 */
		
		
	}
	
	
}
