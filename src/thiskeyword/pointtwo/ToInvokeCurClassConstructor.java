package thiskeyword.pointtwo;

public class ToInvokeCurClassConstructor{

	int a;
	int b;
	
	ToInvokeCurClassConstructor()
	{
		this(10, 20);
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
