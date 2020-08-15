package superkeyword.superwithconstructors;

public class Person {
private int age;

public Person() {
	System.out.println("Person Created !! This is Person Class (Parent Class) non-arg Constructor.");
}

public Person(int i) {
	this.age = i;
	System.out.println("Person created with age =  " + i + " and this is Person Class (Parent Class) Parameterized Constructor");
	
}
}
