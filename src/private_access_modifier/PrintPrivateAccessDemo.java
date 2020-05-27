package private_access_modifier;

public class PrintPrivateAccessDemo {

  public static void main(String args[]) {
	  PrivateAccessModDemo pvvtDemoObj = new PrivateAccessModDemo();
	// System.out.println(pvvtDemoObj.numberofapple); 
	  /** compile time error: field numberofapple not visible **/
//	  pvvtDemoObj.countApples();  
	  /**compile time error: method countApples() not visible **/
	  
  }
	
}
