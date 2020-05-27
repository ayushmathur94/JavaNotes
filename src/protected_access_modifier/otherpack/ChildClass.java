package protected_access_modifier.otherpack;
import protected_access_modifier.pack.*;

public class ChildClass extends Parentclass {

public static void main(String args[]) {
	
	ChildClass cc = new ChildClass();
	
	cc.msg();   // no error even we are calling protected method "msg()" from a class in other package coz the class is child class.  
		
}	
}

// output -: Just wanted to say hi!! and stay safe
