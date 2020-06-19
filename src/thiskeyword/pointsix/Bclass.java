package thiskeyword.pointsix;

public class Bclass {

	int x = 5;
	
	Bclass(){
		Argumentinconstrcall objA = new Argumentinconstrcall(this);
	}
	
	void display() {
		System.out.println("Value of x in class Bclass is : " + x);
	}
	
	public static void main(String[] args) {
		Bclass obj = new Bclass();
	}
	
}


//Output-:  Value of x in class Bclass is : 5