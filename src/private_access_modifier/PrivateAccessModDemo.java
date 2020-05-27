package private_access_modifier;

public class PrivateAccessModDemo {

	private int numberofapple = 15;
	
	private void countApples() {
		 int totalapples = numberofapple + 1;
		System.out.println(totalapples);
	}
	
}
