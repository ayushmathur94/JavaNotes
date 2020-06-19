package thiskeyword.pointone;


public class ThiskeywordCurr {

	int a;
	int b;
	
	 // Parameterized constructor 
	ThiskeywordCurr(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void display() {
		//Displaying value of variables a and b
		System.out.println("a = " + a + " b = " + b);
	}
	
	
	public static void main(String[] args) {
		ThiskeywordCurr object = new ThiskeywordCurr(10, 20);
		
		object.display();
	}
	
}

//output-: a = 10 b = 20