package thiskeyword.pointtwo;

public class ToInvokeCurClassConstructor{

	int a;
	int b;
	
	ToInvokeCurClassConstructor()
	{
		// System.out.println("I am here"); // error if uncommented -:  constructor call must be the first statement in a constructor.
		this(10, 20);  // it is a constructor call for parameterized constructor. it looks for a constructor with tow int parameters/args
		System.out.println("Inside Default Constructor");
	}

	public ToInvokeCurClassConstructor(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
		System.out.println("a and b is :- " + a + " " + b);
	}
	
	public static void main(String[] args) {
		ToInvokeCurClassConstructor objectinst = new ToInvokeCurClassConstructor();
	}
}

/*** Output -:
 * Inside parameterized constructor
 * a and b is :- 10 20
 *  Inside Default Constructor
 */
