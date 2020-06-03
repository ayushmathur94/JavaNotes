package abstract_keyword.abstract_class.examplefour;



abstract class BaseXClass{
	final void fun() {
		System.out.println("base class final fun() called");
	}
}

class DerivedY extends BaseXClass{}

public class FinalMethodinAbstClass {

public static void main(String[] args) {
	BaseXClass bx = new DerivedY();
	bx.fun();
}	
}

//base class final fun() called
