package abstract_keyword.abstract_class.exampleone;


 abstract class Base {
	 abstract void fun();
}
 
class Derived extends Base {
	void fun() {
		System.out.println("Derived fun() called (ie fun overrided)");
	}
}
 
public class AbstractClassInstCannot {
	 public static void main(String args[]) {
		//  Base b = new Base();   //compilation error : Cannot instantiate the type Base (because it is abstract class)
		
		 
		 Base b = new Derived();  // We can have references of Base type
			b.fun();
		}

}