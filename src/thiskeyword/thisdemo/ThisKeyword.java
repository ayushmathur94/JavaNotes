package thiskeyword.thisdemo;

public class ThisKeyword {

	String name;
	
	public ThisKeyword(String name) {
		this.name = name;
		
	}
	
	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword("mobile");
		System.out.println(obj.name); // calling instance variable. And if we remove this , then output will be null
		
		
	}
}


//Output -:  mobile
