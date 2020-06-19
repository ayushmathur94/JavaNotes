package thiskeyword.pointthree;

public class CurrClassInstanceusinThis {

	int a;
	int b;
	
	
	CurrClassInstanceusinThis(){
		a = 10;
		b = 20;
	}
	
	
	//Method that returns current class instance
	CurrClassInstanceusinThis get() {
    
		return this;			
	}
	
	void display() {
		System.out.println("a is: " + a + " b is: " + b );
	}
	
	public static void main(String[] args) {
		CurrClassInstanceusinThis object = new CurrClassInstanceusinThis();
		object.get().display();
	}
	
}


// Output-:  a is: 10 b is: 20
