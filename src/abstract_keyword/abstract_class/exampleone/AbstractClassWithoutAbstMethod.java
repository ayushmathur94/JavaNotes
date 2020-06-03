package abstract_keyword.abstract_class.exampleone;



abstract class BaseClass {
	// An abstract class without any abstract method 
	void fun() {
		System.out.println("Base fun() method it is");
	}
}

class DerivedClass extends BaseClass{
	}

public class AbstractClassWithoutAbstMethod {

	public static void main(String args[]) {
		DerivedClass derivedObj = new DerivedClass();
		derivedObj.fun();
				
	}
}
// Output : Base fun() method it is