package superkeyword.withvariables;


/* derived class / child class Car extending Vehicle */
public class Car  extends Vehicle{

	int maxSpeed = 180;	
	
	void display() {
		/* print maxSpeed of base class (Vehicle) */
		System.out.println("Maximum Speed is : " + super.maxSpeed);
	}
	
}
