package thiskeyword.pointfive;

public class InvokecurrclasmethThis {

	void display() {
		System.out.println("Inside display func.");
		this.show();
		}
	
	void show() {
		System.out.println("Inside show func.");
	}
	
	public static void main(String[] args) {
		InvokecurrclasmethThis instObj = new InvokecurrclasmethThis();
		instObj.display();
	}
}

/** Output -:
 * Inside display func.
 * Inside show func.
 */
