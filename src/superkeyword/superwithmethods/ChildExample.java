package superkeyword.superwithmethods;

public class ChildExample extends Superwithmethods {
void message() {
	System.out.println("This is child or derived or sub class");
}

void display() {
	message();    // will  call current class(child class) message() method

super.message(); // will call parent class message() method
}

}
