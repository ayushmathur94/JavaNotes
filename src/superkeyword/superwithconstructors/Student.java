package superkeyword.superwithconstructors;

public class Student extends Person {

	
	private String name;
	
	public Student() {
		
		System.out.println("Student Created !! This is Student Class (Child Class) non-arg Constructor.");
	}
	
	
	public Student(int i , String n) {
		super(i); // super class parameterized constructor called using super()
		this.name = n;
		System.out.println("Student created with name = " + n + " And this is Student Class (Child Class) Parameterized Constructor");
		
	}
	
}
