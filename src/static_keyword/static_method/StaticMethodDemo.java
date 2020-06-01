package static_keyword.static_method;

public class StaticMethodDemo {

	static int apple = 10;
	
	int  banana = 20;
	
	static void fruitsCount() {
		apple = 20;
		System.out.println("inside fruits count");
		
//		banana = 10;  //compilation error : Cannot make a static reference to the non-static field banana

//		vefeiesCount();  //compilation error : The method vefeiesCount() is undefined for the type StaticMethodDemo
	}

	
	void vegeiesCount() {
		System.out.println("inside vegeiesCount :");
	}
	
	public static void main(String[] args) {
		System.out.println("i am main method"  );
		fruitsCount();
	}
	
}

