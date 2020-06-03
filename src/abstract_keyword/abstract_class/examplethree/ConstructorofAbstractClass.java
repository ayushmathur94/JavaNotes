package abstract_keyword.abstract_class.examplethree;

abstract class Superclass{
	Superclass(){
		System.out.println("Superclass (abstract class) constructor is called");
	}
	abstract void fun();
}

class DerivedClassX extends Superclass{
	DerivedClassX(){
		System.out.println("Derived constructor called");
	}
	void fun() {
		System.out.println("Derived fun() called // implemented super class abstract method!! :)");
	}
}



public class ConstructorofAbstractClass {
	
public static void main(String[] args) {
	DerivedClassX dx = new DerivedClassX();
}
}

// Output :  Superclass (abstract class) constructor is called
//           Derived constructor called 

