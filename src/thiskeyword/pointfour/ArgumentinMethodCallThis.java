package thiskeyword.pointfour;

public class ArgumentinMethodCallThis {

	int a;
	int b;
	
	// Default constructor
	ArgumentinMethodCallThis(){
		a = 10;
		b = 20;
	}
	
	// Method that receives 'this' keyword as parameter
	void display(ArgumentinMethodCallThis objpara) {
		System.out.println("a = " + objpara.a + " and the " +" b = " + objpara.b);
	}
	
	
	
	// Method that returns current class instance 
	void get() {
		display(this);
	}
	
	
	public static void main(String[] args) {
		ArgumentinMethodCallThis objectinst = new ArgumentinMethodCallThis();
		objectinst.get();
		
	}
}

// Output -:    a = 10 and the  b = 20
